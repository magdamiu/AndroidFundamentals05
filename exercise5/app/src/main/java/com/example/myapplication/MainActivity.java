package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragmentA.FragmentAListener {
    private FragmentA fragmentA;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentA = new FragmentA();
        fragmentTransaction.add(R.id.containerA, fragmentA);
        fragmentTransaction.commit();
    }

    @Override
    public void onInputASent() {
        String text = fragmentA.getTextFromEditText();
        textView.setText(text);
    }
}