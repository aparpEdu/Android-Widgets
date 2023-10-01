package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button5;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button1.setOnClickListener(view -> startActivity(new Intent(this, TimePickerWidget.class)));
        button2.setOnClickListener(view -> startActivity(new Intent(this, CheckBoxWidget.class)));
        button3.setOnClickListener(view -> startActivity(new Intent(this, SpinnerWidget.class)));
        button5.setOnClickListener(view -> startActivity(new Intent(this, RadioBoxWidget.class)));
        button6.setOnClickListener(view -> startActivity(new Intent(this, DatePickerWidget.class)));
        button7.setOnClickListener(view -> startActivity(new Intent(this, ProgressBarWidget.class)));
    }
}