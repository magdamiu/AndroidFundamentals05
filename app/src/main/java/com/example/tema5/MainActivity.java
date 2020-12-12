package com.example.tema5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private String text;
    private EditText websiteText, locationText, shareText, phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ex4);
        websiteText = findViewById(R.id.website_text);
        locationText = findViewById(R.id.location_text);
        shareText = findViewById(R.id.share_text);
        phoneText = findViewById(R.id.call_text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, new Throwable().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, new Throwable().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, new Throwable().getStackTrace()[0].getMethodName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, new Throwable().getStackTrace()[0].getMethodName());
    }

    public void goToSecondActivity(View view) {
        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(secondActivity);
    }


    public void buttonOneClick(View view) {
        text = getResources().getString(R.string.button_one);
        goToSecondActivityEx2();
    }

    public void buttonTwoClick(View view) {
        text = getResources().getString(R.string.button_two);
        goToSecondActivityEx2();
    }

    public void buttonThreeClick(View view) {
        text = getResources().getString(R.string.button_three);
        goToSecondActivityEx2();
    }

    public void goToSecondActivityEx2() {
        Intent secondActivity = new Intent(MainActivity.this, SecondActivityEx2.class);
        secondActivity.putExtra("text", text);
        startActivity(secondActivity);
    }

    public void onPhoneButtonClick(View view) {
        String value = "tel:" + phoneText.getText().toString();
        Intent implicitIntentCaller = new Intent(Intent.ACTION_DIAL);
        implicitIntentCaller.setData(Uri.parse(value));
        if (implicitIntentCaller.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentCaller);
        }
    }

    public void onShareButtonClick(View view) {
        String value = shareText.getText().toString();
        Intent implicitIntentCaller = new Intent(Intent.ACTION_SEND);
        implicitIntentCaller.setType("text/plain");
        startActivity(Intent.createChooser(implicitIntentCaller, value));
    }

    public void onLocationButtonClick(View view) {
        String value = "geo:0,0?q=" + locationText.getText().toString().replace(" ", "+").toLowerCase();
        Intent implicitIntentCaller = new Intent(Intent.ACTION_VIEW);
        implicitIntentCaller.setData(Uri.parse(value));
        if (implicitIntentCaller.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentCaller);
        }
    }

    public void onWebsiteButtonClick(View view) {
        String value = websiteText.getText().toString();
        Intent implicitIntentCaller = new Intent(Intent.ACTION_VIEW);
        implicitIntentCaller.setData(Uri.parse(value));
        if (implicitIntentCaller.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentCaller);
        }
    }
}