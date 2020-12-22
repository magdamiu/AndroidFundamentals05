package com.android.androidfundamentalsgroup1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    private static final int REQUEST_CODE_MESSAGE = 40;
    public static final String MESSAGE_KEY = "message";

    TextView textView1, textView2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        textView1 = findViewById(R.id.textView1_activity1);
        textView2 = findViewById((R.id.textView2_activity1));
        editText = findViewById((R.id.editText_activity1));
    }

    public void onClickSendButton(View view) {
        String message = editText.getEditableText().toString();

        if(message != null && message.length() > 0) {
            Intent secondActivity = new Intent(Activity1.this, Activity2.class);
            secondActivity.putExtra(MESSAGE_KEY, message);
            startActivityForResult(secondActivity, REQUEST_CODE_MESSAGE);
        } else {
            editText.requestFocus();
            editText.setError("Please enter your message");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_MESSAGE && resultCode == RESULT_OK) {
            String reply = data.getStringExtra(Activity2.REPLY_KEY);
            textView1.setText("Reply received");
            textView2.setText(reply);
            editText.setText("");
        }
    }
}