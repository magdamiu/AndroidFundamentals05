package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChallengeNo2Activity1 extends AppCompatActivity {

    private Button textOneButton;
    private Button textTwoButton;
    private Button textThreeButton;
    private TextView textOneView;
    private TextView textTwoView;
    private TextView textThreeView;

    public static final String MESSAGE_KEY = "secretMessage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no21);

        textOneButton = findViewById(R.id.textOneButton);
        textTwoButton = findViewById(R.id.textTwoButton);
        textThreeButton = findViewById(R.id.textThreeButton);
        textOneView = findViewById(R.id.textOneView);
        textTwoView = findViewById(R.id.textTwoView);
        textThreeView = findViewById(R.id.textThreeView);

        textOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextActivity(textOneView.getText().toString());
            }
        });

        textTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextActivity(textTwoView.getText().toString());
            }
        });

        textThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextActivity(textThreeView.getText().toString());
            }
        });
    }

    void goToNextActivity(String textToShow) {
        Intent challengeNo2Activity2 = new Intent(ChallengeNo2Activity1.this, ChallengeNo2Activity2.class);
        challengeNo2Activity2.putExtra(MESSAGE_KEY, textToShow);
        startActivity(challengeNo2Activity2);
    }
}