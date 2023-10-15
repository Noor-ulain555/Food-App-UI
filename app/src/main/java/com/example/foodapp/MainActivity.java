package com.example.foodapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button next;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      next=findViewById(R.id.Next_btn);
      next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Intent a =new Intent(MainActivity.this, sign_In.class);
            startActivity(a);
         }
      });

   }
}