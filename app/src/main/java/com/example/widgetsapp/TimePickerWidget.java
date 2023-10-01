package com.example.widgetsapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.example.widgetsapp.fragment.TimePickerFragment;

public class TimePickerWidget extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_widget);
        button = findViewById(R.id.button4);

        button.setOnClickListener(view -> {
            DialogFragment fragment = new TimePickerFragment();
            fragment.show(getSupportFragmentManager(), "Select Time");
        });
    }
}