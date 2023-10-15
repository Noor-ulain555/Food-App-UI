package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        new CountDownTimer(3000, 1000) { // 3000 milliseconds, 1000 milliseconds interval
            @Override
            public void onTick(long millisUntilFinished) {}
            @Override
            public void onFinish() {
                Intent i = new Intent(screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }.start();
    }
}





