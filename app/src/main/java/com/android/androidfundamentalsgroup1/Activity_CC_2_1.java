package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.android.androidfundamentalsgroup1.R.string.twelve_days_of_christmas;

public class Activity_CC_2_1 extends AppCompatActivity {
    public static final String TEXT_KEY = "message";
    private final String TAG = "Activity_CC_2_1";
    private Button buttonTextOne;
    private Button buttonTextTwo;
    private Button buttonTextThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c_c_2_1);
        buttonTextOne = findViewById(R.id.button_text_one);
        buttonTextTwo = findViewById(R.id.button_text_two);
        buttonTextThree = findViewById(R.id.button_text_three);
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

    public void buttonOpenSecondActivityCC2OnClick(View view) {
        final String textOne = getString(R.string.have_yourself_a_merry_little_christmas);
        final String textTwo = getString(R.string.carol_of_the_bells);
        final String textThree = getString(R.string.twelve_days_of_christmas);

        Intent secondActivity = new Intent(Activity_CC_2_1.this, Activity_CC_2_2.class);
        switch (view.getId())
        {
            case R.id.button_text_one:
                secondActivity.putExtra(TEXT_KEY, textOne);
                break;
            case R.id.button_text_two:
                secondActivity.putExtra(TEXT_KEY, textTwo);
                break;
            case R.id.button_text_three:
                secondActivity.putExtra(TEXT_KEY, textThree);
                break;
        }
        startActivity(secondActivity);
    }
}