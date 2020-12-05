package com.example.androidfundamentalsweek3codechallange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button buttonSubmit;
    private EditText editEmail;
    private EditText editPhone;
    private TextView showEmail;
    private TextView showPhone;
    private Spinner spinnerAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Code challange 1
        //setContentView(R.layout.views_week3challange1);
        //displayViewWeek3Challange1();

        //Code challange 2, screen 1
        //setContentView(R.layout.views_week3challange2);

        //Code challange 2, screen 2
        //setContentView(R.layout.views_week3challange2_2);

        //Code challange 2, screen 3
        setContentView(R.layout.views_week3challange2_3);
        setUpSpinnerAdapter();


    }

    private void displayViewWeek3Challange1(){
        buttonSubmit = findViewById(R.id.submitButton);
        editEmail = findViewById(R.id.emailEditText);
        editPhone = findViewById(R.id.phoneEditText);
        showEmail = findViewById(R.id.showEmail);
        showPhone = findViewById(R.id.showPhone);
    }

    public void submitButtonOnClick(View view){
        String contentEmail = editEmail.getText().toString();
        String contentPhone = editPhone.getText().toString();

        if(contentEmail != null && contentEmail.length() > 0){
            showEmail.setText(contentEmail);
        }
        else{
            showEmail.setError("invalid Email");
        }
        if(contentPhone != null && contentPhone.length() > 0){
            showPhone.setText(contentPhone);
        }
        else{
            showPhone.setError("invalid Phone Number");
        }
    }

    //Spinner
    //Step1 = Get data
    private List<String> getSpinnerData() {
        List<String> androidVersions = new ArrayList<>();
        androidVersions.add("Cupcake");
        androidVersions.add("Donut");
        androidVersions.add("Eclair");
        androidVersions.add("KitKat");
        androidVersions.add("Pie");
        return androidVersions;
    }

    //Step 2 = Adapter
    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getSpinnerData());
    }

    private void setUpSpinnerAdapter() {
        spinnerAndroidVersions = findViewById(R.id.spinnerAndroidVersions);
        spinnerAndroidVersions.setAdapter(getSpinnerAdapter());
        spinnerAndroidVersions.setOnItemSelectedListener(this); //eroare la this
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long itemId) {
        List<String> androidVersions = getSpinnerData();
        String selectedVersion = androidVersions.get(position);
        Toast.makeText(MainActivity.this, selectedVersion, Toast.LENGTH_LONG).show();
    }
}