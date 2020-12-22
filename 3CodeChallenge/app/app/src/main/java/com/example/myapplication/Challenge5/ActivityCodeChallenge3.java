package com.example.myapplication.Challenge5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class ActivityCodeChallenge3 extends AppCompatActivity {

    private EditText edittextSendMessage;
    private TextView textViewMessageReceived;
    private TextView textViewMessage;

    public static final String KEY_MESSAGE = "message";
    public static final int REQUES_CODE_MESSAGE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_challenge3);

        edittextSendMessage = findViewById(R.id.editTextSendMessage);
        textViewMessageReceived = findViewById(R.id.textViewMessageReceinved);
        textViewMessage = findViewById(R.id.textViewMessage);
    }

    public void buttonSendMessage(View view) {
        Intent secondActivity = new Intent(ActivityCodeChallenge3.this, SecondActivityCodeChallenge3.class);
        String contentFromEditTextSendMessage = edittextSendMessage.getText().toString();
        if (contentFromEditTextSendMessage != null && contentFromEditTextSendMessage.length() >0) {
            secondActivity.putExtra(KEY_MESSAGE, contentFromEditTextSendMessage);
            startActivityForResult(secondActivity, REQUES_CODE_MESSAGE);
            edittextSendMessage.setText("");
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUES_CODE_MESSAGE && resultCode == RESULT_OK) {
            String result = data.getStringExtra(KEY_MESSAGE);
            textViewMessage.setText(R.string.reply_received);
            textViewMessageReceived.setText(result);
        }
    }
}