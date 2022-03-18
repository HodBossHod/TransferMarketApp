package com.mycode.newapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void registerUser(User user);

    @Query("SELECT * from users where email=(:email) and password=(:password)")
    User login(String email,String password);

    @Query("SELECT * from users")
    List<User> login_list();
}
