package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChallengeNo3Activity1 extends AppCompatActivity {

    private Button activity1Button;
    private EditText activity1EditText;
    private TextView activity1TextView1;
    private TextView activity1TextView2;

    public static final String MESSAGE_KEY = "secretMessage2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no31);

        activity1Button = findViewById(R.id.activity1Button);
        activity1EditText = findViewById(R.id.activity1EditText);
        activity1TextView1 = findViewById(R.id.activity1TextView1);
        activity1TextView2 = findViewById(R.id.activity1TextView2);

        activity1TextView1.setText("");
        activity1TextView2.setText("");

        activity1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ChallengeNo3Activity2 = new Intent(ChallengeNo3Activity1.this, ChallengeNo3Activity2.class);
                ChallengeNo3Activity2.putExtra(MESSAGE_KEY, activity1EditText.getText().toString());
                startActivity(ChallengeNo3Activity2);
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String textToShow = bundle.getString(ChallengeNo3Activity2.MESSAGE_KEY);
            this.activity1TextView1.setText("Reply received");
            this.activity1TextView2.setText(textToShow);
        }

    }
}