package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public static final String REPLY_KEY = "reply";

    TextView textView1, textView2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView1 = findViewById(R.id.textView1_activity2);
        textView2 = findViewById((R.id.textView2_activity2));
        editText = findViewById((R.id.editText_activity2));

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String message = bundle.getString(Activity1.MESSAGE_KEY);
            textView1.setText("Message received");
            textView2.setText(message);
        }
    }

    public void onClickSendButton(View view) {
        String reply = editText.getEditableText().toString();

        if(reply != null && reply.length() > 0) {
            Intent intent = new Intent();
            intent.putExtra(REPLY_KEY, reply);
            setResult(RESULT_OK, intent);
            finish();
        } else {
            editText.requestFocus();
            editText.setError("Please enter your reply");
        }
    }
}