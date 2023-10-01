package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarWidget extends AppCompatActivity {

    ProgressBar progressBar;
    Button fullBarButton;
    Button zeroBarButton;
    Button incrementButton;
    Button decrementButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        progressBar = findViewById(R.id.progressBar);
        fullBarButton = findViewById(R.id.button8);
        zeroBarButton = findViewById(R.id.button9);
        incrementButton = findViewById(R.id.button10);
        decrementButton = findViewById(R.id.button11);
        fullBarButton.setOnClickListener(view -> progressBar.setProgress(100));
        zeroBarButton.setOnClickListener(view -> progressBar.setProgress(0));
        incrementButton.setOnClickListener(view -> progressBar.incrementProgressBy(25));
        decrementButton.setOnClickListener(view -> progressBar.setProgress(progressBar.getProgress() - 25));
    }
}