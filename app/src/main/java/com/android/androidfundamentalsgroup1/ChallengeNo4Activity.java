package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChallengeNo4Activity extends AppCompatActivity {

    private Button webSiteButton;
    private EditText editTextWebSite;

    private Button locationButton;
    private EditText editTextLocation;

    private Button shareButton;
    private EditText editTextShare;

    private Button callButton;
    private EditText editTextCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_no4);

        webSiteButton = findViewById(R.id.webSiteButton);
        editTextWebSite = findViewById(R.id.editTextWebSite);

        locationButton = findViewById(R.id.locationButton);
        editTextLocation = findViewById(R.id.editTextLocation);

        shareButton = findViewById(R.id.shareButton);
        editTextShare = findViewById(R.id.editTextShare);

        callButton = findViewById(R.id.callButton);
        editTextCall = findViewById(R.id.editTextCall);

        webSiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(editTextWebSite.getText().toString()));
                startActivity(intent);
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(editTextLocation.getText().toString()));
//                mapIntent.setPackage("com.google.android.apps.maps");
//                startActivity(mapIntent);

                // AICI NU AM STIUT
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, editTextShare.getText().toString() + BuildConfig.APPLICATION_ID);
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + editTextCall.getText().toString()));
                startActivity(intent);
            }
        });
    }
}