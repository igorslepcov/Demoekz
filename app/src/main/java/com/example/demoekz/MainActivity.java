package com.example.demoekz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer Timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                Intent intent2 = new Intent(MainActivity.this, signin.class);
                startActivity(intent2);
            }
        };
        Timer.schedule(task,3000L);
    }
}
