package com.example.happybirthday;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocalDate currentDate = LocalDate.now();
        LocalDate birthdayDate = LocalDate.of(LocalDate.now().getYear(), 10, 10);

        if(currentDate.isAfter(birthdayDate)) {
            Log.e("MainActivity", "Ai ratat o zi de nastere!");
        }
    }
}