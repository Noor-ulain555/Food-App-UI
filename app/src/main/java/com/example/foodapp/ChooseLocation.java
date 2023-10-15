package com.example.foodapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class ChooseLocation extends AppCompatActivity {
 TextView click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location);
        String[] locationSuggestions = {"Karachi", "Lahore", "Islamabad", "Sargodha", "Faislabad", "GujraWala"};
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.listoflocation);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, locationSuggestions);
        autoCompleteTextView.setAdapter(adapter);
        click=findViewById(R.id.move);}
}

