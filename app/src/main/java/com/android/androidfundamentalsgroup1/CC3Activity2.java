package com.android.androidfundamentalsgroup1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CC3Activity2 extends AppCompatActivity {

    protected static final String MESSAGE_KEY2 = "message2";
    private static final int REQUEST_CODE_MESSAGE2 = 26;
    TextView textView1, textView2;
    EditText editText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cc3_activity_2);

        textView1 = findViewById(R.id.textView1Activity2);
        textView2 = findViewById(R.id.textView2Activity2);
        editText = findViewById(R.id.editTextFromActivity2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(CC3Activity1.MESSAGE_KEY);
            textView2.setText(message);
            textView1.setText(R.string.message_received);

            message = "yesss";

            Intent intent = new Intent();
            intent.putExtra(CC3Activity1.MESSAGE_KEY, message);

            setResult(RESULT_OK, intent);
        }
    }

    public void sendMessageToActivity1OnClick(View view) {
        Intent activity1 = new Intent(CC3Activity2.this, CC3Activity1.class);
        String message = editText.getText().toString();
        if (message != null && message.length() > 0) {
            activity1.putExtra(MESSAGE_KEY2, message);
        } else {
            editText.setError(getString(R.string.no_message_error));
        }
        startActivityForResult(activity1, REQUEST_CODE_MESSAGE2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_MESSAGE2 && resultCode == RESULT_OK) {
            String result = data.getStringExtra(MESSAGE_KEY2);
        }
    }
}