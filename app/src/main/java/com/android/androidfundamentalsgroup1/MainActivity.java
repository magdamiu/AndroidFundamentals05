package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;
    private EditText messageInput;
    private TextView titleTextView, messageTextView;

    public static final String TEXT_KEY = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.buttonSendPrimary);
        messageInput = findViewById(R.id.editTextMessagePrimary);
        titleTextView = findViewById(R.id.textViewTitlePrimary);
        messageTextView = findViewById(R.id.textViewMessagePrimary);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            titleTextView.setVisibility(View.VISIBLE);
            messageTextView.setVisibility(View.VISIBLE);

            String text = bundle.getString(SecondActivity.TEXT_KEY);
            messageTextView.setText(text);
        } else {
            titleTextView.setVisibility(View.GONE);
            messageTextView.setVisibility(View.GONE);
        }
    }

    public void buttonSendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        String message = messageInput.getText().toString();

        intent.putExtra(TEXT_KEY, message);
        startActivity(intent);
    }
}