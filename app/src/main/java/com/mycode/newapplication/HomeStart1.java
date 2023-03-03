package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.mycode.newapplication.databinding.ActivityHomeStart1Binding;

public class HomeStart1 extends AppCompatActivity {
    private ActivityHomeStart1Binding activityHomeStart1Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeStart1Binding=ActivityHomeStart1Binding.inflate(getLayoutInflater());
        View view=activityHomeStart1Binding.getRoot();
        setContentView(view);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        activityHomeStart1Binding.signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Login.class);
                startActivity(i);
            }
        });

        activityHomeStart1Binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });
    }
}