package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;

public class TimePickerWidget extends AppCompatActivity {

    TimePicker timePicker;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_widget);

//        timePicker = findViewById(R.id.timerTest);
//        timePicker.setIs24HourView(true);
        button = findViewById(R.id.button4);


//        AtomicReference<String> currentTime = new AtomicReference<>("Time is " + timePicker.getHour() + ":" + timePicker.getMinute());
//        Toast.makeText(this, currentTime.get(), Toast.LENGTH_SHORT).show();
//        button.setOnClickListener(view -> {
//            currentTime.set("Time is " + timePicker.getHour() + ":" + timePicker.getMinute());
//            Toast.makeText(this, currentTime.get(), Toast.LENGTH_SHORT).show();
//        });

        button.setOnClickListener(view -> {
            DialogFragment fragment = new TimePickerFragment();
            fragment.show(getSupportFragmentManager(), "Select Time");
        });
    }
}