package com.android.androidfundamentalsgroup1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CC2FirstActivity extends AppCompatActivity {

    public static final String MESSAGE_KEY = "message1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cc2_activity_first);
    }


    public void launchSecondActivityFromFirstButton(View view) {
        Intent activity = new Intent(CC2FirstActivity.this, CC2SecondActivity.class);
        activity.putExtra(MESSAGE_KEY, getString(R.string.message1));
        startActivity(activity);
    }

    public void launchSecondActivityFromSecondButton(View view) {
        Intent activity = new Intent(CC2FirstActivity.this, CC2SecondActivity.class);
        activity.putExtra(MESSAGE_KEY, getString(R.string.message2));
        startActivity(activity);
    }

    public void launchSecondActivityFromThirdButton(View view) {
        Intent activity = new Intent(CC2FirstActivity.this, CC2SecondActivity.class);
        activity.putExtra(MESSAGE_KEY, getString(R.string.message3));
        startActivity(activity);
    }
}