package com.example.tema2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView editText;
    private Switch autoBackup;
    private Button changeColorButton;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tema2);

        editText = findViewById(R.id.editText);
        autoBackup = findViewById(R.id.autoBackup);
        changeColorButton = findViewById(R.id.blueishButton);
        ratingBar = findViewById(R.id.ratingBar);
    }

    public void SwitchOnOff(View view) {
        String text = editText.getText().toString();
        if (text.toUpperCase().equals("AUTO BACKUP ON")) {
            autoBackup.setChecked(true);
        } else {
            if (text.toUpperCase().equals("AUTO BACKUP OFF")) {
                autoBackup.setChecked(false);
            }
        }
    }

    public void ColorChange(View view) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
    }

    public void YesButtonClick(View view) {
        ratingBar.setRating(5);
    }

    public void NoButtonClick(View view) {
        ratingBar.setRating(0);
    }
}