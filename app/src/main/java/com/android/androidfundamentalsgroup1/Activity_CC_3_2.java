package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.android.androidfundamentalsgroup1.Activity_CC_3_1.REQUEST_CODE_MESSAGE;

public class Activity_CC_3_2 extends AppCompatActivity {
    private Button buttonSend;
    private TextView textViewTitle;
    private TextView textViewMsgRecv;
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__c_c_3_2);
        buttonSend = findViewById(R.id.buttonSend2);
        textViewTitle = findViewById(R.id.textViewTitle2);
        textViewMsgRecv = findViewById(R.id.textViewMsgRecv2);
        editTextMessage = findViewById(R.id.editTextWriteMessage2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String message = bundle.getString(Activity_CC_3_1.MSG_KEY);
            textViewTitle.setText(R.string.message_received);
            textViewMsgRecv.setText(message);
        }
    }

    public void buttonSendMessage2OnClick(View view) {
        Intent secondActivity = new Intent(Activity_CC_3_2.this, Activity_CC_3_1.class);
        String message = editTextMessage.getText().toString();
        if(message != null && message.length() > 0) {
            secondActivity.putExtra(Activity_CC_3_1.MSG_KEY, message);
            setResult(RESULT_OK, secondActivity);
            // removes the current activity from the stack of activities
            finish();
        }
        else {
            editTextMessage.setError(getString(R.string.error_message_text_empty));
        }
    }


}