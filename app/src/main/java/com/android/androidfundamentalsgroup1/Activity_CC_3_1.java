package com.android.androidfundamentalsgroup1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.Contacts.SettingsColumns.KEY;
import static com.android.androidfundamentalsgroup1.MainActivity.MESSAGE_KEY;

public class Activity_CC_3_1 extends AppCompatActivity {
    public static final int REQUEST_CODE_MESSAGE = 12;
    public static final String MSG_KEY = "message_sent";
    private Button buttonSend;
    private TextView textViewTitle;
    private TextView textViewMsgRecv;
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c_c_3_1);
        buttonSend = findViewById(R.id.buttonSend1);
        textViewTitle = findViewById(R.id.textViewTitle1);
        textViewMsgRecv = findViewById(R.id.textViewMsgRecv1);
        editTextMessage = findViewById(R.id.editTextWriteMessage1);
    }

    public void buttonSendMessageOnClick(View view) {
        Intent secondActivity = new Intent(Activity_CC_3_1.this, Activity_CC_3_2.class);
        String message = editTextMessage.getText().toString();
        if(message != null && message.length() > 0) {
            secondActivity.putExtra(MSG_KEY, message);
            startActivityForResult(secondActivity, REQUEST_CODE_MESSAGE);
        }
        else {
            editTextMessage.setError(getString(R.string.error_message_text_empty));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_MESSAGE && resultCode == RESULT_OK) {
            String result = data.getStringExtra(MSG_KEY);
            textViewTitle.setText(R.string.reply_received);
            textViewMsgRecv.setText(result);
        }
    }
}