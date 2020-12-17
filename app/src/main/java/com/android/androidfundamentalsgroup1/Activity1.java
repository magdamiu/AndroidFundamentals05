package com.android.androidfundamentalsgroup1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    public static final String MESSAGE_KEY_ACTIVITY_1 = "messageActivity1";
    private static final int REQUEST_CODE_MESSAGE_ACTIVITY_1 = 1;
    private static final String TAG = "Activity1";

    private Button sendButton;
    private TextView textViewMessageState;
    private TextView textViewMessage;
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        textViewMessageState = findViewById(R.id.message_state);
        textViewMessage = findViewById(R.id.message_text);
        sendButton = findViewById(R.id.button_send_message);
        editTextMessage = findViewById(R.id.message_edit_text);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(Activity1.this, Activity2.class);
        String messageToBeSent = editTextMessage.getText().toString();

        if (messageToBeSent.length() > 0) {
            intent.putExtra(MESSAGE_KEY_ACTIVITY_1, messageToBeSent);
            startActivityForResult(intent, REQUEST_CODE_MESSAGE_ACTIVITY_1);
        } else {
            editTextMessage.setError(getString(R.string.you_need_to_send_a_message));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        editTextMessage.setText("");

        if (requestCode == REQUEST_CODE_MESSAGE_ACTIVITY_1 && resultCode == RESULT_OK) {
            String message = data.getStringExtra(Activity2.MESSAGE_KEY_ACTIVITY_2);
            textViewMessageState.setText(R.string.reply_received);
            textViewMessage.setText(message);
        } else {
            Logging.show(TAG, "Error!");
        }
    }
}