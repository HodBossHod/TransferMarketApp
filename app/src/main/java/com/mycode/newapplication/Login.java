package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
    EditText email,password;
    Button signIn,back;
    TextView msg_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.e_mail);
        password=findViewById(R.id.pass);
        signIn=findViewById(R.id.signin);
        back=findViewById(R.id.back);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String emailText=email.getText().toString();
                 String passwordText=password.getText().toString();
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

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),HomeStart1.class);
                startActivity(i);
            }
        });
    }
}