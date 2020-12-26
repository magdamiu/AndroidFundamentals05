package com.android.androidfundamentalsgroup1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CC4Activity extends AppCompatActivity {

    Button buttonWebsite, buttonLocation, buttonText, buttonPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cc4_activity);
    }

    public void openWebsiteOnClick(View view) {
        buttonWebsite = findViewById(R.id.buttonWebsite);
        String website = buttonWebsite.getText().toString();

        if (website.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(getString(R.string.https_www_android_com))); //this works
            //intent.setData(Uri.parse(website)); //this doesn't work
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            buttonWebsite.setError(getString(R.string.error_no_input_in_edittext));
        }
    }

    public void openLocationOnClick(View view) {
        buttonLocation = findViewById(R.id.buttonLocation);
        String location = buttonLocation.getText().toString();

        if (location.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:0,0?q=" + location)); //opens google maps, but at current location
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            buttonLocation.setError(getString(R.string.error_no_input_in_edittext));
        }
    }

    public void shareTextOnClick(View view) {
        buttonText = findViewById(R.id.buttonText);
        String text = buttonText.getText().toString();

        if (text.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, text);
            Intent shareIntent = Intent.createChooser(intent, null);
            if (intent.resolveActivity(getPackageManager()) != null && shareIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(shareIntent);
            }
        } else {
            buttonText.setError(getString(R.string.error_no_input_in_edittext));
        }
    }

    public void callOnClick(View view) {
        buttonPhone = findViewById(R.id.buttonPhone);
        String phone = buttonPhone.getText().toString();

        if (phone.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            //intent.setData(Uri.parse("tel:" + getString(R.string._8005551234))); //this works
            intent.setData(Uri.parse("tel:" + phone)); //this returns 2255 no matter what the input is
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            buttonPhone.setError(getString(R.string.error_no_input_in_edittext));
        }
    }
}