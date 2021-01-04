package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public ImageView imageView;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void plusButton(View view) {
        ++count;
        if (count > 6) {
            count = 0;
        }
        imageView.setImageLevel(count);
    }

    public void minusButton(View view) {
        --count;
        if (count < 0) {
            count = 6;
        }
        imageView.setImageLevel(count);
    }

}