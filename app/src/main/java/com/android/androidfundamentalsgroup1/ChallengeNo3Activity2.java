package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChallengeNo3Activity2 extends AppCompatActivity {

    private Button activity2Button;
    private EditText activity2EditText;
    private TextView activity2TextView1;
    private TextView activity2TextView2;

    public static final String MESSAGE_KEY = "secretMessage3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no32);

        activity2Button = findViewById(R.id.activity2Button);
        activity2EditText = findViewById(R.id.activity2EditText);
        activity2TextView1 = findViewById(R.id.activity2TextView1);
        activity2TextView2 = findViewById(R.id.activity2TextView2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String textToShow = bundle.getString(ChallengeNo3Activity1.MESSAGE_KEY);
            this.activity2TextView1.setText("Message received");
            this.activity2TextView2.setText(textToShow);
        }

        activity2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ChallengeNo3Activity1 = new Intent(ChallengeNo3Activity2.this, ChallengeNo3Activity1.class);
                ChallengeNo3Activity1.putExtra(MESSAGE_KEY, activity2EditText.getText().toString());
                startActivity(ChallengeNo3Activity1);
            }
        });

    }
}