package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_ex4 extends AppCompatActivity {
    private Button openWebsiteButton;
    private Button openLocationButton;
    private Button shareTextButton;
    private Button callButton;

    private EditText webSiteEditText;
    private EditText openLocationEditText;
    private EditText shareTextEditText;
    private EditText callEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);

        openWebsiteButton = findViewById(R.id.button_URL);
        openLocationButton = findViewById(R.id.button_location);
        shareTextButton = findViewById(R.id.button_share_text);
        callButton = findViewById(R.id.button_call);

        webSiteEditText = findViewById(R.id.edit_text_url);
        openLocationEditText = findViewById(R.id.edit_text_location);
        shareTextEditText = findViewById(R.id.edit_text_share);
        callEditText = findViewById(R.id.edit_text_call);
    }

    public void openWebsite(View view) {
        String website = webSiteEditText.getText().toString();
        if (website.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(website));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            webSiteEditText.setError(getString(R.string.you_need_to_fill_website));
        }
    }

    public void openLocation(View view) {
        String location = openLocationEditText.getText().toString();
        if (location.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:0,0?q=" + location));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            webSiteEditText.setError(getString(R.string.you_need_to_fill_location));
        }
    }

    public void shareText(View view) {
        String text = shareTextEditText.getText().toString();
        if (text.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, text);

            Intent shareIntent = Intent.createChooser(intent, null);

            if (intent.resolveActivity(getPackageManager()) != null && shareIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(shareIntent);
            }
        } else {
            webSiteEditText.setError(getString(R.string.you_need_to_fill_text));
        }
    }

    public void call(View view) {
        String phone = callEditText.getText().toString();
        if (phone.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phone));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        } else {
            callEditText.setError(getString(R.string.you_need_to_fill_phone_number));
        }
    }
}