package com.android.androidfundamentalsgroup1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ThreeButtonsActivity1 extends AppCompatActivity {

    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_buttons1);

        button1 = findViewById((R.id.button_first_paragraph));
        button2 = findViewById((R.id.button_second_paragraph));
        button3 = findViewById((R.id.button_third_paragraph));
    }

    public int getButtonIndex(String buttonText) {
        return buttonText.charAt(buttonText.length() - 1) - '0';
    }

    public void onClickButton1(View view) {
        int index = getButtonIndex(button1.getText().toString()) - 1;
        Intent secondActivity = new Intent(ThreeButtonsActivity1.this, ThreeButtonsActivity2.class);
        secondActivity.putExtra("index", index);
        startActivity(secondActivity);
    }

    public void onClickButton2(View view) {
        int index = getButtonIndex(button2.getText().toString()) - 1;
        Intent secondActivity = new Intent(ThreeButtonsActivity1.this, ThreeButtonsActivity2.class);
        secondActivity.putExtra("index", index);
        startActivity(secondActivity);
    }

    public void onClickButton3(View view) {
        int index = getButtonIndex(button3.getText().toString()) - 1;
        Intent secondActivity = new Intent(ThreeButtonsActivity1.this, ThreeButtonsActivity2.class);
        secondActivity.putExtra("index", index);
        startActivity(secondActivity);
    }
}