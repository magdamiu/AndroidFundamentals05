package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity_CC_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c_c_4);
    }


    public void buttonUriOnClick(View view) {
        Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
        implicitIntent.setData(Uri.parse("https://www.history.com/topics/christmas/history-of-christmas"));
        startActivity(implicitIntent);
    }

    public void buttonMapOnClick(View view) {
        Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
        implicitIntent.setData(Uri.parse("geo:0,0?q=67.9222,26.5046(Lapland)"));
        startActivity(implicitIntent);
    }

    public void buttonAnotherAppOnClick(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "It's Christmas timeee!");
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }

    public void buttonPhoneOnClick(View view) {
        Intent implicitIntent = new Intent(Intent.ACTION_DIAL);
        implicitIntent.setData(Uri.parse("tel:0733189902"));
        startActivity(implicitIntent);
    }
}