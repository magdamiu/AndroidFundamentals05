package com.example.code_challange_number_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button submitButton;
    EditText emailTextEdit, phoneTextEdit;
    CheckBox termsAndConditions;
    Spinner androidVersionsSpinner;
    public static final Pattern EMAIL_ADDRESS = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.code_challenge_number_2_ex_1);
        setContentView(R.layout.code_challenge_number_2_ex_2_screen_4_and_5);

        // submitButton = findViewById(R.id.submitButton);
        // emailTextEdit = findViewById(R.id.emailTextEdit);
        // phoneTextEdit = findViewById(R.id.phoneTextEdit);
        // termsAndConditions = findViewById(R.id.termsAndConditions);
        androidVersionsSpinner = findViewById(R.id.spinnerAndroidVersions);

        setUpSpinner();
        // provideSubmitButtonFunctionality();
    }

    public void setUpSpinner(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.android_versions,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        androidVersionsSpinner.setAdapter(adapter);
        androidVersionsSpinner.setOnItemSelectedListener(this);
    }

    public void provideSubmitButtonFunctionality() {
        this.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateEmailAddress(emailTextEdit.getText().toString()) && termsAndConditions.isChecked()) {
                    Toast.makeText(
                            getApplicationContext(),
                            "Successfully Submitted!",
                            Toast.LENGTH_LONG
                    ).show();
                } else {
                    if (!termsAndConditions.isChecked()) {
                        Toast.makeText(
                                getApplicationContext(),
                                "Terms and Conditions have to be checked out!",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                    else{
                        Toast.makeText(
                                getApplicationContext(),
                                "Invalid Email Address!",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }
            }
        });
    }

    public boolean validateEmailAddress(String email) {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}