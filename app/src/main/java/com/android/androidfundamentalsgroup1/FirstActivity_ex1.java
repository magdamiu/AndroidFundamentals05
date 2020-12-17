package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity_ex1 extends AppCompatActivity {
    private final String TAG = "FirstActivity_ex1";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logging.show(TAG, "onCreate");

        setContentView(R.layout.activity_first_ex1);
        button = findViewById(R.id.next_activity_button);
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

    @Override
    protected void onRestart() {
        super.onRestart();
        Logging.show(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logging.show(TAG, "onDestroy");
    }

    public void buttonSetNextActivity(View view) {
        Intent secondActivity = new Intent(this, SecondActivity_ex1.class);
        startActivity(secondActivity);
    }
}