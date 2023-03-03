package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.mycode.newapplication.databinding.ActivityLoginBinding;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        binding.signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String emailText=binding.eMail.getText().toString();
                 String passwordText=binding.pass.getText().toString();
                 if(emailText.isEmpty()||passwordText.isEmpty()){
                     Toast.makeText(getApplicationContext(),"Fill all fields",Toast.LENGTH_SHORT).show();
                 }else{
                     //Perform Query

                     UserDatabase userDatabase=UserDatabase.getUserDatabase(getApplicationContext());
                     UserDao userDao=userDatabase.userDao();
//                     new Thread(new Runnable() {
//                         @Override
//                         public void run() {
                     if(userDao.login_list().size()==0){
                         Toast.makeText(Login.this, "empty database", Toast.LENGTH_SHORT).show();
                     }
                             List<User>user_list=new ArrayList<>();
                             user_list=userDao.login_list();
                             Boolean is_found=false;
                             Toast.makeText(Login.this, passwordText, Toast.LENGTH_SHORT).show();
                             for(int i=0;i<userDao.login_list().size();i++){
                                 if(user_list.get(i).getEmail().equals(emailText)&&user_list.get(i).getPassword().equals(passwordText)){
                                     is_found=true;
                                     break;
                                 }
                             }
                             if(is_found){
                                 Intent i=new Intent(getApplicationContext(),MainActivity.class);
                                 startActivity(i);
                             }else{
                                 Toast.makeText(getApplicationContext(),"Invalid input!!",Toast.LENGTH_SHORT).show();
                             }
                             User user=userDao.login(emailText,passwordText);
//
//                             if(user==null){
//                                 runOnUiThread(new Runnable() {
//                                     @Override
//                                     public void run() {
//                                         Toast.makeText(getApplicationContext(),"Invalid input!!",Toast.LENGTH_SHORT).show();
//                                     }
//                                 });
//                             }else{
//                                 Intent i=new Intent(getApplicationContext(),MainActivity.class);
//                                 startActivity(i);
//                             }

                         //}
                     //}).start();
                 }
            }
        });

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),HomeStart1.class);
                startActivity(i);
            }
        });

        binding.footer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });

    }
}