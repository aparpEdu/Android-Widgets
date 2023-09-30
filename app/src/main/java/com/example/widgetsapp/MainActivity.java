package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button5 = findViewById(R.id.button5);
        button.setOnClickListener(view -> startActivity(new Intent(this, TimePickerWidget.class)));
        button2.setOnClickListener(view -> startActivity(new Intent(this, CheckBoxWidget.class)));
        button3.setOnClickListener(view -> startActivity(new Intent(this, SpinnerWidget.class)));
        button5.setOnClickListener(view -> startActivity(new Intent(this, RadioBoxWidget.class)));
    }
}