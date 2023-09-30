package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxWidget extends AppCompatActivity {

    CheckBox checkBox;
    CheckBox checkBox2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_widget);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        button = findViewById(R.id.checkBoxButton);
        button.setOnClickListener(view -> {
            if (checkBox.isChecked()){
                Toast.makeText(getApplicationContext(), "Option 1 selected", Toast.LENGTH_SHORT).show();
            }
            if ((checkBox2.isChecked())){
                Toast.makeText(getApplicationContext(), "Option 2 selected", Toast.LENGTH_SHORT).show();
            }
            if(!checkBox.isChecked() && !checkBox2.isChecked()){
                Toast.makeText(this, "No option selected", Toast.LENGTH_LONG).show();
            }
        });
    }
}