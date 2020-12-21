package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ChallengeNo2Activity2 extends AppCompatActivity {

    private TextView textToShowTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no22);

        textToShowTextView = findViewById(R.id.textToShowTextView);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String textToShow = bundle.getString(ChallengeNo2Activity1.MESSAGE_KEY);
            this.textToShowTextView.setText(textToShow);
        }
    }
}