package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public static final String MESSAGE_KEY_ACTIVITY_2 = "messageActivity2";

    private Button sendButton;
    private TextView textViewMessageState;
    private TextView textViewMessage;
    private EditText editTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        set one layout for both activities
        setContentView(R.layout.activity_1);

        sendButton = findViewById(R.id.button_send_message);
        textViewMessage = findViewById(R.id.message_text);
        textViewMessageState = findViewById(R.id.message_state);
        editTextMessage = findViewById(R.id.message_edit_text);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(Activity1.MESSAGE_KEY_ACTIVITY_1);
            textViewMessageState.setText(R.string.message_received);
            textViewMessage.setText(message);
        }
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(Activity2.this, Activity1.class);
        String messageToBeSent = editTextMessage.getText().toString();

        if (messageToBeSent.length() > 0) {
            intent.putExtra(MESSAGE_KEY_ACTIVITY_2, messageToBeSent);
            setResult(RESULT_OK, intent);
            finish();
        } else {
            editTextMessage.setError(getString(R.string.you_need_to_send_a_message));
        }
    }
}