package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_Up extends AppCompatActivity {
 TextView already;
 Button login,fb,googli;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    already=findViewById(R.id.account);
    login=findViewById(R.id.register);
    already.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent c= new Intent(Sign_Up.this, sign_In.class);
            startActivity(c);
        }
    });

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent c = new Intent(Sign_Up.this, sign_In.class);
        startActivity(c);
        }
    });


        fb=findViewById(R.id.facebook);
        googli=findViewById(R.id.google);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        googli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }

        });
    }
}