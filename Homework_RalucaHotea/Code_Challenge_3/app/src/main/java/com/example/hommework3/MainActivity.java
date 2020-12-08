package com.example.hommework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText emailContent;
    private EditText phoneContent;
    private Button submitButton;
    private TextView textResult;
    private CheckBox checkBox;
    private boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_first_view);

        submitButton = findViewById(R.id.button_id);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailContent = findViewById(R.id.email_id);
                phoneContent = findViewById(R.id.phone_id);

                boolean isEmailValid = isValidEmail(emailContent.getText().toString());
                boolean isPhoneValid = isValidPhone(phoneContent.getText().toString());

                if(isEmailValid && isPhoneValid && checked){
                    textResult = findViewById(R.id.text_id);
                    textResult.setText(emailContent.getText().toString()+ " " + phoneContent.getText().toString() + " " + checked);

                }
                else{
                    emailContent.setText("");
                    phoneContent.setText("");
                    emailContent.setError(getString(R.string.error_message));
                    phoneContent.setError(getString(R.string.error_message_phone));
                }
            }
        });
        checkBox = findViewById(R.id.checkbox_id);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    checked = true;
                }else{
                    checked = false;
                }
            }
        });
    }
    public static boolean isValidEmail(String textTarget) {
        return (!TextUtils.isEmpty(textTarget) && Patterns.EMAIL_ADDRESS.matcher(textTarget).matches());
    }

    public static boolean isValidPhone(String textTarget) {
        return (!TextUtils.isEmpty(textTarget) && Patterns.PHONE.matcher(textTarget).matches());
    }


}