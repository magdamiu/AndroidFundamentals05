package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView oneTextView;
    private EditText editTextUserFullName;
    private CheckBox checkBoxTermsAndConditions;
    private SeekBar seekBarCountChallenges;
    private TextView textViewPurpleContent;
    private Button buttonGetContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Code challenge 2
        setContentView(R.layout.code_challange_1);

        // Code challange 1
        try {
            double randomNumber = new Random().nextInt(1000);
            Log.e("Main Activity", randomNumber + "");
            if (randomNumber < 500) {
                throw new Exception("Error wrong number " + randomNumber);
            }
        } catch (Exception e) {
//            Log.e("Main Activity", e.getMessage());
            Logging.show(this, e.getMessage());
        }
    }


    public void buttonGetContentOnClick(View view) {
        // preluam contentul din EditText si il convertim in String
        String contentFromEditText = editTextUserFullName.getText().toString();
        if (contentFromEditText != null && contentFromEditText.length() > 0) {
            textViewPurpleContent.setText(contentFromEditText);
        } else {
            editTextUserFullName.setError(getString(R.string.error_missing_text));
        }
    }
}
