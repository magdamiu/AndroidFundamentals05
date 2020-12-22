package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "FAILURE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            Log.e(TAG, "Nu exista element la pozitia 5");
        }
    }
}