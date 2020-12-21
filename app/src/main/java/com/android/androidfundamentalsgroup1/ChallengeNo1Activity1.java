package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChallengeNo1Activity1 extends AppCompatActivity {

    private Button redirectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no11);

        redirectButton = findViewById(R.id.redirectButton);

        redirectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent challengeActivity2 = new Intent(ChallengeNo1Activity1.this, ChallengeNo1Activity2.class);
                startActivity(challengeActivity2);
            }
        });

        Logging.show("Activity1", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show("Activity1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show("Activity1", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show("Activity1", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show("Activity1", "onStop");
    }
}