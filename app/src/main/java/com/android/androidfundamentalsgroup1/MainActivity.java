package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstEditText;
    private EditText secondEditText;
    private Switch _switch;
    private int countBlue = 0, countGreen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_challenge2);
    }

    public void BlueButtonOnClick(View view) {
        firstEditText = findViewById(R.id.firstEditText);
        countBlue++;
        firstEditText.setText("Blue button click: " + countBlue);
    }

    public void GreenButtonClick(View view) {
        secondEditText = findViewById(R.id.secondEditText);
        countGreen++;
        secondEditText.setText("Green button click: " + countGreen);
    }
}
