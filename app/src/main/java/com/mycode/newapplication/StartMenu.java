package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.mycode.newapplication.databinding.ActivityStartMenuBinding;

public class StartMenu extends AppCompatActivity {

    private ActivityStartMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityStartMenuBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent newMenu=new Intent(getApplicationContext(),HomeStart1.class);
                    startActivity(newMenu);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();

    }
}