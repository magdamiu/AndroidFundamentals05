package com.android.androidfundamentalsgroup1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CC3Activity1 extends AppCompatActivity {

    public static final String MESSAGE_KEY = "cod";
    private static final int REQUEST_CODE_MESSAGE = 13;
    TextView textView1, textView2;
    EditText editText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cc3_activity_1);

        textView1 = findViewById(R.id.textView1Activity1);
        textView2 = findViewById(R.id.textView2Activity1);
        editText = findViewById(R.id.editTextFromActivity1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(CC3Activity2.MESSAGE_KEY2);
            textView2.setText(message);
            textView1.setText(R.string.reply_received);

            Intent intent = new Intent();
            intent.putExtra(CC3Activity2.MESSAGE_KEY2, message);

            setResult(RESULT_OK, intent);
        }
    }

    public void sendMessageToActivity2OnClick(View view) {
        Intent activity2 = new Intent(CC3Activity1.this, CC3Activity2.class);
        String message = editText.getText().toString();
        if (message != null && message.length() > 0) {
            activity2.putExtra(MESSAGE_KEY, message);
        } else {
            editText.setError(getString(R.string.no_message_error));
        }
        startActivityForResult(activity2, REQUEST_CODE_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_MESSAGE && resultCode == RESULT_OK) {
            String result = data.getStringExtra(MESSAGE_KEY);
        }
    }
}