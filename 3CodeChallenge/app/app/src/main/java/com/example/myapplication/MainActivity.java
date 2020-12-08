package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText emailEditText, phoneEditText;
    private CheckBox termsCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.views_sample_login_view);
        displayViewsSampleLoginViews();
    }

    public void displayViewsSampleLoginViews() {
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        termsCheckbox = findViewById(R.id.termsCheckbox);
    }

    public void buttonSubmit(View view) {
        String contentFromEmailEditText = emailEditText.getText().toString();
        String contentFromPhoneEditText = phoneEditText.getText().toString();

        if (!Patterns.EMAIL_ADDRESS.matcher(contentFromEmailEditText).matches() || !Patterns.PHONE.matcher(contentFromPhoneEditText).matches() || !termsCheckbox.isChecked()) {
            emailEditText.setError(getString(R.string.submit_error));
        } else
            Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }

    private List<String> getSpinnerSantasReindeerDataSource() {
        List<String> santasReindeer = new ArrayList<>();

        santasReindeer.add("Rudolph");
        santasReindeer.add("Dasher");
        santasReindeer.add("Dancer");
        santasReindeer.add("Donner");
        santasReindeer.add("Vixen");
        santasReindeer.add("Comet");
        santasReindeer.add("Cupid");
        santasReindeer.add("Prancer");
        santasReindeer.add("Blitzen");

        return santasReindeer;
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getSpinnerSantasReindeerDataSource());
    }

    private void setupSpinnerAdapter() {
        Spinner spinnerSantasReindeer = findViewById(R.id.spinnerSantasReindeer);
        spinnerSantasReindeer.setAdapter(getSpinnerAdapter());
        spinnerSantasReindeer.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        List<String> santasReindeer = getSpinnerSantasReindeerDataSource();
        String selectedSantasReindeer = "Selected: " + santasReindeer.get(position);
        Toast.makeText(this, selectedSantasReindeer, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    public void buttonGetChallenge2View(View view) {
        setContentView(R.layout.views_sample_challenge2);
    }

    public void buttonGetChallenge2FrameLayout(View view) {
        setContentView(R.layout.views_sample_challenge2_frame_layout);
    }

    public void buttonGetChallenge2Spinner(View view) {
        setContentView(R.layout.views_sample_challenge2_spinner);
        setupSpinnerAdapter();
    }

    public void buttonGetPuzzleGame(View view) {
        setContentView(R.layout.views_sample_puzzle_game);
    }
}