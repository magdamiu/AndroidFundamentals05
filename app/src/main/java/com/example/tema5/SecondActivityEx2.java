package com.example.tema5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityEx2 extends AppCompatActivity {
    private TextView textToPrint;
    private String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ex2);
        textToPrint = findViewById(R.id.scrollable_text);
        txt = getIntent().getStringExtra("text");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        textToPrint.setText(txt);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void backOnePage(View view) {
        Intent secondActivity = new Intent(SecondActivityEx2.this, MainActivity.class);
        startActivity(secondActivity);
    }
}
