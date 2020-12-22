package com.example.myapplication.Challenge5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class ActivityCodeChallenge2 extends AppCompatActivity {

    private Button buttonTextOne;
    private Button buttonTextTwo;
    private Button buttonTextThree;

    public static final String KEY_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_challenge2);

        buttonTextOne = findViewById(R.id.buttonTextOne);
        buttonTextTwo = findViewById(R.id.buttonTextTwo);
        buttonTextThree = findViewById(R.id.buttonTextThree);
    }

    public void buttonGetTextOne(View view) {
        Intent secondActivity = new Intent(ActivityCodeChallenge2.this, SecondActivityCodeChallenge2.class);
        String contentFromButtonTextOne = buttonTextOne.getText().toString();
        if (contentFromButtonTextOne != null && contentFromButtonTextOne.length() >= 0) {
            secondActivity.putExtra(KEY_MESSAGE, contentFromButtonTextOne);
        }
        startActivity(secondActivity);
    }

    public void buttonGetTextTwo(View view) {
        Intent secondActivity = new Intent(ActivityCodeChallenge2.this, SecondActivityCodeChallenge2.class);
        String contentFromButtonTextTwo = buttonTextTwo.getText().toString();
        if (contentFromButtonTextTwo != null && contentFromButtonTextTwo.length() >= 0) {
            secondActivity.putExtra(KEY_MESSAGE, contentFromButtonTextTwo);
        }
        startActivity(secondActivity);
    }

    public void buttonGetTextThree(View view) {
        Intent secondActivity = new Intent(ActivityCodeChallenge2.this, SecondActivityCodeChallenge2.class);
        String contentFromButtonTextThree = buttonTextThree.getText().toString();
        if (contentFromButtonTextThree != null && contentFromButtonTextThree.length() >= 0) {
            secondActivity.putExtra(KEY_MESSAGE, contentFromButtonTextThree);
        }
        startActivity(secondActivity);
    }
}