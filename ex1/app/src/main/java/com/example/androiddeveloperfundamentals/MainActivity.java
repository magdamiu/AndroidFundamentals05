package com.example.androiddeveloperfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                validateEmailAddress(email, password);
           }
        });
    }

    private boolean validateEmailAddress(EditText email, EditText password) {
        String emailInput = email.getText().toString();
        String passwordInput = password.getText().toString();

        if (emailInput.isEmpty() || passwordInput.isEmpty()
                || !Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            Toast.makeText(this, "Email Validation Failed!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}