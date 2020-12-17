package com.example.tema5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivityEx3 extends AppCompatActivity {

    private EditText editTextSecondPerson;
    private TextView textViewSecondPerson, messageReceivedSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ex3);
        textViewSecondPerson = findViewById(R.id.textViewSecondPerson);
        editTextSecondPerson = findViewById(R.id.messageSecondPerson);
        messageReceivedSecond = findViewById(R.id.textViewReceivedSecond);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            messageReceivedSecond.setVisibility(View.VISIBLE);
            textViewSecondPerson.setText(bundle.getString("message"));
        } else
            messageReceivedSecond.setVisibility(View.INVISIBLE);
    }

    public void sendMessageToFirstPerson(View view) {
        Intent secondActivity = new Intent(SecondActivityEx3.this, MainActivity.class);
        secondActivity.putExtra("message", editTextSecondPerson.getText().toString());
        startActivity(secondActivity);
    }
}