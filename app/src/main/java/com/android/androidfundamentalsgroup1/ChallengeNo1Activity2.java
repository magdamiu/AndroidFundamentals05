package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ChallengeNo1Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no12);

        Logging.show("Activity2", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show("Activity2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show("Activity2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show("Activity2", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show("Activity2", "onStop");
    }
}