package com.example.codechallange3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private String mes;
    private TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.activity1_button);
        editText = (EditText) findViewById(R.id.activity1_editext);

        if (getIntent().hasExtra("Message")) {
            mes = getIntent().getStringExtra("Message");

            textView1 = (TextView) findViewById(R.id.activity1_textView1);
            textView1.setText("Reply received");
            textView1.setTypeface(null, Typeface.BOLD);
            textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);

            textView2 = (TextView) findViewById(R.id.activity1_textView2);
            textView2.setText(mes);
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = editText.getText().toString();

        Log.i("Activity1", message);

        intent.putExtra("Message", message);
        startActivity(intent);
    }
}