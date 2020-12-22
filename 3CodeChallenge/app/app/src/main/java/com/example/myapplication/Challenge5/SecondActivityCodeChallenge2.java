package com.example.myapplication.Challenge5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class SecondActivityCodeChallenge2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_code_challenge2);

        textView = findViewById(R.id.textViewGetContent);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(ActivityCodeChallenge2.KEY_MESSAGE);
            textView.setText(message);
        }
    }
}