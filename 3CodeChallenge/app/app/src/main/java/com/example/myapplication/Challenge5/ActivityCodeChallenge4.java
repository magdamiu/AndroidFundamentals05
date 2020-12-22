package com.example.myapplication.Challenge5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

public class ActivityCodeChallenge4 extends AppCompatActivity {

    private EditText edittextPhoneCall;
    private EditText editTextOpenLocation;
    private EditText edittextOpenWebSite;
    private EditText editTextShareText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_challenge4);

        edittextPhoneCall = findViewById(R.id.editTextPhoneCall);
        editTextOpenLocation = findViewById(R.id.editTextOpenLocation);
        edittextOpenWebSite = findViewById(R.id.editTextOpenWebSite);
        editTextShareText = findViewById(R.id.editTextShareText);
    }

    public void buttonGetPhoneCall(View view) {
        Intent implicitIntentCaller = new Intent(Intent.ACTION_DIAL);
        String contentFromEdittextPhoneCall = edittextPhoneCall.getText().toString();
        implicitIntentCaller.setData(Uri.parse("tel:" + contentFromEdittextPhoneCall));
        if (implicitIntentCaller.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentCaller);
        }
    }

    public void buttonOpenLocation(View view) {
        Intent implicitIntentOpenLocation = new Intent(Intent.ACTION_VIEW);
        String contentFromEditTextOpenLocation = editTextOpenLocation.getText().toString();
        implicitIntentOpenLocation.setData(Uri.parse("geo:0,0?q=" + contentFromEditTextOpenLocation));
        if (implicitIntentOpenLocation.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentOpenLocation);
        }
    }

    public void buttonGetWebSite(View view) {
        Intent implicitIntentOpenWebSite = new Intent(Intent.ACTION_VIEW);
        String contentFromEditTextOpenWebSite = edittextOpenWebSite.getText().toString();
        implicitIntentOpenWebSite.setData(Uri.parse(contentFromEditTextOpenWebSite));
        if (implicitIntentOpenWebSite.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentOpenWebSite);
        }
    }

    public void buttonShareText(View view) {
        Intent implicitIntentShareText = new Intent(Intent.ACTION_SEND);
        String contentFromEditTextShareText = editTextShareText.getText().toString();
        implicitIntentShareText.putExtra(Intent.EXTRA_TEXT, contentFromEditTextShareText);
        implicitIntentShareText.setType("text/plain");
        if (implicitIntentShareText.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentShareText);
        }
    }
}