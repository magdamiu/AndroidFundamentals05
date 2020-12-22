package com.example.myapplication.Challenge5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class SecondActivityCodeChallenge3 extends AppCompatActivity {

    private TextView textViewMessageReceived;
    private TextView textViewMessage;
    private EditText editTextSendMessage;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_code_challenge3);

        textViewMessageReceived = findViewById(R.id.textViewMessageReceinved);
        textViewMessage = findViewById(R.id.textViewMessage);
        editTextSendMessage = findViewById(R.id.editTextMessageSend);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String message = bundle.getString(ActivityCodeChallenge3.KEY_MESSAGE);
            textViewMessage.setText(R.string.message_received);
            textViewMessageReceived.setText(message);
        }
    }

    public void buttonSendMessage(View view) {
        Intent intent = new Intent(SecondActivityCodeChallenge3.this, ActivityCodeChallenge3.class);
        String contentFromEditTextSendMessage = editTextSendMessage.getText().toString();
        if (contentFromEditTextSendMessage != null && contentFromEditTextSendMessage.length() > 0) {
            intent.putExtra(ActivityCodeChallenge3.KEY_MESSAGE, contentFromEditTextSendMessage);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}