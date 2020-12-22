package com.example.myapplication.Challenge5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Logging;
import com.example.myapplication.R;

public class ActivityCodeChallenge1 extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_challenge1);
        Logging.show(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show(TAG, "onStop");
    }

    public void buttonGetSecondActivity(View view) {
        Intent secondActivity = new Intent(ActivityCodeChallenge1.this, SecondActivityCodeChallenge1.class);
        startActivity(secondActivity);
    }
}