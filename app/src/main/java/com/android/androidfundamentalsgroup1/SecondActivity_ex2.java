package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity_ex2 extends AppCompatActivity {
    private TextView passageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ex2);

        passageTextView = findViewById(R.id.textViewPassage);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(FirstActivity_ex2.TEXT_MESSAGE_KEY);
            passageTextView.setText(message);
        }
    }
}