package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonTextOne;
    private Button buttonTextTwo;
    private Button buttonTextThree;

    public static final String TEXT_KEY = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTextOne = findViewById(R.id.buttonTextOne);
        buttonTextTwo = findViewById(R.id.buttonTextTwo);
        buttonTextThree = findViewById(R.id.buttonTextThree);
    }

    public void buttonOneOpenSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(TEXT_KEY, getString(R.string.dummy_text_1));
        startActivity(intent);
    }

    public void buttonTwoOpenSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(TEXT_KEY, getString(R.string.dummy_text_2));
        startActivity(intent);
    }

    public void buttonThreeOpenSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(TEXT_KEY, getString(R.string.dummy_text_3));
        startActivity(intent);
    }
}