package com.android.androidfundamentalsgroup1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView secondActivityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondActivityTextView = findViewById(R.id.secondActivityTextView);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String text = bundle.getString(MainActivity.TEXT_KEY);
            secondActivityTextView.setText(text);
        }
    }
}
