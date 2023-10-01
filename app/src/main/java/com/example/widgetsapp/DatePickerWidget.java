package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.widgetsapp.fragment.DatePickerFragment;

public class DatePickerWidget extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_widget);
        button = findViewById(R.id.dateButton);
        button.setOnClickListener(view -> {
            DialogFragment fragment = new DatePickerFragment();
            fragment.show(getSupportFragmentManager(), "Select Date");
        });
    }
}