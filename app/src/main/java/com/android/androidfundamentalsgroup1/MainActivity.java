package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    /*private TextView oneTextView;
    private EditText editTextUserFullName;
    private CheckBox checkBoxTermsAndConditions;
    private SeekBar seekBarCountChallenges;
    private TextView textViewPurpleContent;
    private Button buttonGetContent;*/

    //course 3: code challenge 1
    private EditText editTextEmail;
    private EditText editTextPhone;
    private CheckBox checkBoxTC;
    private Button   buttonSubmit;
    private TextView textViewSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // seteaza layout-ul asociat activatii MainActivity
        // setContentView(R.layout.activity_main);
        // asociem views_sample_1 ca layout al activitatii MainActivity

        //Course 3 - code challenge 2 screen 3
        setContentView(R.layout.view_frame_layout);
        //Course 3 - code challenge 1
        /*setContentView(R.layout.view_login);
        editTextEmail  = findViewById(R.id.emailEditText);
        editTextPhone  = findViewById(R.id.phoneEditText);
        checkBoxTC     = findViewById(R.id.checkboxTC);
        buttonSubmit   = findViewById(R.id.buttonSubmit);
        textViewSubmit = findViewById(R.id.submitTextView);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String contentEmail = editTextEmail.getText().toString();
                String contentPhone = editTextPhone.getText().toString();

                Boolean completed = true;
                if (!isValidEmail(contentEmail)) {
                    editTextEmail.setError(getString(R.string.error_email_not_valid));
                    completed = false;
                }
                if(!isValidPhone(contentPhone)) {
                    editTextPhone.setError(getString(R.string.error_phone_not_valid));
                    completed = false;
                }
                if (completed) {
                    Boolean tcChecked = false;
                    if(checkBoxTC.isChecked())
                        tcChecked = true;
                    textViewSubmit.setText(getString(R.string.email) + ": " + contentEmail
                            + "\n" + getString(R.string.phone) + ": " + contentPhone
                            + "\n" + getString(R.string.a_accept_t_and_c) + ": "
                            + tcChecked.toString());
                }
            }
        });*/


        //Code challenge 2
        //setContentView(R.layout.view_code_challenge);

        //Course 2
        /*oneTextView = findViewById(R.id.firstTextView);
        oneTextView.setText(R.string.new_text);

        editTextUserFullName = findViewById(R.id.editTextFullName);
        editTextUserFullName.setText(R.string.default_full_name);

        checkBoxTermsAndConditions = findViewById(R.id.checkboxTermsAndConditions);
        if (checkBoxTermsAndConditions.isChecked()) {
            checkBoxTermsAndConditions.setChecked(false);
            oneTextView.setText(R.string.checkbox_checked);
        } else {
            checkBoxTermsAndConditions.setChecked(true);
            oneTextView.setText(R.string.checkbox_unchecked);
        }

        checkBoxTermsAndConditions.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    editTextUserFullName.setText(R.string.checkbox_state_checked);
                } else {
                    editTextUserFullName.setText(R.string.checkbox_state_unchecked);
                }
            }
        });

        seekBarCountChallenges = findViewById(R.id.seekBarChallenges);
        seekBarCountChallenges.setProgress(5);

        textViewPurpleContent = findViewById(R.id.textViewPurpleContent);

        buttonGetContent = findViewById(R.id.buttonGetContent);*/
        // block comment/un-comment CTRL + Shift + /
        /*buttonGetContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // preluam contentul din EditText si il convertim in String
                String contentFromEditText = editTextUserFullName.getText().toString();
                if (contentFromEditText != null && contentFromEditText.length() > 0) {
                    textViewPurpleContent.setText(contentFromEditText);
                } else {
                    editTextUserFullName.setError(getString(R.string.error_missing_text));
                }
            }
        });*/

        //Code challenge 1
        /*Random random = new Random();
        try {
            int number = random.nextInt(100);
            if(number >= 10) {
                throw new Exception(number + " is not a digit");
            }
        }
        catch(Exception e) {
            Logging.show(this, e.getMessage());
        }*/

    }


    /*public void buttonGetContentOnClick(View view) {
        // preluam contentul din EditText si il convertim in String
        String contentFromEditText = editTextUserFullName.getText().toString();
        if (contentFromEditText != null && contentFromEditText.length() > 0) {
            textViewPurpleContent.setText(contentFromEditText);
        } else {
            editTextUserFullName.setError(getString(R.string.error_missing_text));
        }
    }*/

    private boolean isValidEmail(String email) {
        if (email == null || email.length() <= 0) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
    }

    private boolean isValidPhone(String phone) {
        if (phone == null || phone.length() <= 0) {
            return false;
        } else {
            return Patterns.PHONE.matcher(phone).matches();
        }

    }
}
