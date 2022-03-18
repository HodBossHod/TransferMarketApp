package com.mycode.newapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class UserDatabase extends RoomDatabase {
    private static final String dbName="user";
    public abstract UserDao userDao();
    private static UserDatabase userDatabase;
    public static UserDatabase getUserDatabase(Context context){
        if(userDatabase==null){
            userDatabase= Room.databaseBuilder(context.getApplicationContext(),UserDatabase.class,dbName)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return userDatabase;
    }


}
