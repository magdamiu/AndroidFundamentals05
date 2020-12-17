package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity_ex1 extends AppCompatActivity {
    private final String TAG = "SecondActivity_ex1";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ex1);
        button = findViewById(R.id.go_back_button);

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

    public void buttonSetFirstActivity(View view) {
        Intent intent = new Intent(SecondActivity_ex1.this, FirstActivity_ex1.class);
        startActivity(intent);
    }
}