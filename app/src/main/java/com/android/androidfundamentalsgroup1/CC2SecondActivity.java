package com.android.androidfundamentalsgroup1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CC2SecondActivity extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cc2_activity_second);

        textView1 = findViewById(R.id.textView1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(CC2FirstActivity.MESSAGE_KEY);
            textView1.setText(message);
            //scrollView.addView(textView1);
        }
    }
}