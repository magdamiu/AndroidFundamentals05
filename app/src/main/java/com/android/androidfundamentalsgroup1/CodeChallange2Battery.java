package com.android.androidfundamentalsgroup1;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CodeChallange2Battery extends AppCompatActivity {

    public ImageView imageBattery;
    public int level = 0;
    public int maxlevel = 5;
    public int minlevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_challange2_battery);

        imageBattery = findViewById(R.id.imageBattery);
    }

    public void increaseOnClick(View view) {
        level = level + 1;
        if (level <= maxlevel) {
            imageBattery.setImageLevel(level);
        } else {
            imageBattery.setImageLevel(maxlevel);
            level = maxlevel;
        }
    }

    public void decreaseOnClick(View view) {
        level = level - 1;
        if (level >= minlevel) {
            imageBattery.setImageLevel(level);
        } else {
            imageBattery.setImageLevel(minlevel);
            level = minlevel;
        }
    }
}