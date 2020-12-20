package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_CC_2_2 extends AppCompatActivity {

    private final String TAG = "Activity_CC_2_2";
    private TextView textViewContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c_c_2_2);
        Bundle text = getIntent().getExtras();
        if(text != null)
        {
            String textLyrics = text.getString(Activity_CC_2_1.TEXT_KEY);
            textViewContent = findViewById(R.id.textViewCC_2_2);
            textViewContent.setText(textLyrics);

        }
        Logging.show(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show(TAG, "onStop");
    }
}