package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.mycode.newapplication.databinding.ActivityRegisterBinding;

public class Register extends AppCompatActivity {
    private ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        binding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating User Entity
                User user=new User();
                user.setName(binding.name.getText().toString());
                user.setEmail(binding.mail.getText().toString());
                user.setPassword(binding.password.getText().toString());
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
                }else if(!Patterns.EMAIL_ADDRESS.matcher(binding.mail.getText().toString()).matches()){
                    Toast.makeText(getApplicationContext(),"Invalid e-mail",Toast.LENGTH_SHORT).show();
                }else{
                    userDao.registerUser(user);
                    Toast.makeText(Register.this, "User registered successfully!", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),Login.class);
                    startActivity(i);
                }
            }
        });
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),HomeStart1.class);
                startActivity(i);
            }
        });

        binding.footer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Login.class);
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