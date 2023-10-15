package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_In extends AppCompatActivity {
  TextView account1;
  Button fb,googli,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    account1=findViewById(R.id.newa);
     login=findViewById(R.id.login);
  account1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent c=new Intent(sign_In.this, Sign_Up.class);
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
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c =new Intent(sign_In.this, ChooseLocation.class);

                startActivity(c);

            }
        });
    }
}
