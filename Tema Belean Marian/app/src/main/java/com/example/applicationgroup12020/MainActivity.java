package com.example.applicationgroup12020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aplicattiongroup12020.R;

public class MainActivity extends AppCompatActivity {
    private TextView oneTextView;
    private TextView secondTextView;
    private TextView thirdTextView;
    private EditText edittext1;
    private EditText edittext2;
    private CheckBox checkBoxNotify;
    private Button b1;
    private Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //seteaza layout-ul asociat activitatii MainActivity
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.views_sample_1);

        oneTextView = findViewById(R.id.firstTextView);
        secondTextView = findViewById(R.id.secondTextView);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contentFromEditText = edittext1.getText().toString();

                if (contentFromEditText != null && contentFromEditText.length() > 0) {
                    oneTextView.setText(contentFromEditText);
                } else {
                    oneTextView.setError(getString(R.string.error_missing_text));
                }
            }
            });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contentFromEditText = edittext2.getText().toString();

                if (contentFromEditText != null && contentFromEditText.length() > 0) {
                    secondTextView.setText(contentFromEditText);
                } else {
                    secondTextView.setError(getString(R.string.error_missing_text));
                }
            }
        });

        checkBoxNotify = findViewById(R.id.checkboxNotify);
        if(checkBoxNotify.isChecked())
        {
            checkBoxNotify.setChecked(false);
            oneTextView.setText(R.string.checkbcheck);
        } else {
            checkBoxNotify.setChecked(true);
            oneTextView.setText(R.string.checkbuncheck);
        }
        checkBoxNotify.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(compoundButton.isChecked()) {
                    secondTextView.setText(R.string.checkbox_state_checked);
                }else
                {
                    secondTextView.setText(R.string.checkbox_state_unchecked);
                }
            }
        });



    }
}