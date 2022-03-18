package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    EditText name,email,pass,confirm;
    Button register,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.name);
        email=findViewById(R.id.mail);
        pass=findViewById(R.id.password);
        register=findViewById(R.id.signup);
        back=findViewById(R.id.back);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating User Entity
                User user=new User();
                user.setName(name.getText().toString());
                user.setEmail(email.getText().toString());
                user.setPassword(pass.getText().toString());
                UserDatabase user_db=UserDatabase.getUserDatabase(getApplicationContext());
                final UserDao userDao=user_db.userDao();

                if(!validateInput(user)){
                    //Do insert operation

                    Toast.makeText(getApplicationContext(),"Fill all fields",Toast.LENGTH_SHORT).show();
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
                            //Register User

//                             runOnUiThread(new Runnable() {
//                                 @Override
//                                 public void run() {
//                                     Toast.makeText(getApplicationContext(),"User registered successfully!",Toast.LENGTH_SHORT).show();
//                                 }
//                             });

//                        }
//                    }).start();
                }else if(!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
                    Toast.makeText(getApplicationContext(),"Invalid e-mail",Toast.LENGTH_SHORT).show();
                }else{
                    userDao.registerUser(user);
                    Toast.makeText(Register.this, "User registered successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),HomeStart1.class);
                startActivity(i);
            }
        });
    }

    private Boolean validateInput(User user){
        if(user.getEmail().isEmpty()||
           user.getPassword().isEmpty()||
        user.getName().isEmpty()){
            return false;
        }
        return true;
    }
}