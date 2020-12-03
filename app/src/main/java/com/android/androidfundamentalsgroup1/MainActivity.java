package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private final String ANDROID_DOCS = "https://developer.android.com/";

    private Button buttonSubmit;
    private EditText email;
    private EditText phone;
    private CheckBox tAndC;
    private String loginContent = "";


    private TextView oneTextView;
    private EditText editTextUserFullName;
    private CheckBox checkBoxTermsAndConditions;
    private SeekBar seekBarCountChallenges;
    private TextView textViewPurpleContent;
    private Button buttonGetContent;
    private WebView webViewAndroid;
    private Spinner spinnerAndroidVersions;
    private RecyclerView recyclerViewEmails;

    private List<Email> emails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // seteaza layout-ul asociat activatii MainActivity
        // setContentView(R.layout.activity_main);
        // asociem views_sample_1 ca layout al activitatii MainActivity
        // setContentView(R.layout.views_sample_1);
        // displayViewsSample1();

        // run ScrollView sample
        // setContentView(R.layout.views_sample_scroll_view);

        // run WebView sample
        // setContentView(R.layout.views_sample_web_view);
        // loadUrlInWebView();

        // run Spinner sample
        // setContentView(R.layout.views_sample_spinner);
        // setupSpinnerAdapter();

        // run RecyclerView sample
//        setContentView(R.layout.views_sample_recycler_view);
//        displayEmailsList();

        /////////////HOMEWORK

        //view_group_challenge_1
        //setContentView(R.layout.view_group_challenge_1);
        //displayInfos();

        //view_group_challenge_2.1
        //setContentView(R.layout.view_group_challenge_2_screen_1);

        //view_group_challenge_2.2
        //setContentView(R.layout.view_group_challenge_2_screen_2);

        //view_group_challenge_2.3
        setContentView(R.layout.view_group_challenge_2_screen_3);
        setupSpinnerAdapter();
    }

    private void displayInfos() {

        email = findViewById(R.id.email_edit_text);
        phone = findViewById(R.id.phone_edit_text);
        tAndC = findViewById(R.id.t_c_check_box);

        buttonSubmit = findViewById(R.id.submit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String emailContent = email.getText().toString();
                String phoneContent = phone.getText().toString();

                if (!emailContent.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailContent).matches()) {
                    email.setError(null);
                    loginContent += emailContent + "\n";
                    if (!phoneContent.isEmpty() && Patterns.PHONE.matcher(phoneContent).matches()) {
                        phone.setError(null);
                        loginContent += phoneContent + "\n";
                        if (tAndC.isChecked()) {
                            tAndC.setError(null);
                            loginContent += "T and C checked";
                            Toast.makeText(MainActivity.this, loginContent, Toast.LENGTH_LONG).show();
                            loginContent = "";
                        } else {
                            tAndC.setError("T and C is not checked");
                            loginContent = "";
                        }
                    } else {
                        phone.setError("Fill the input with a valid phone");
                        loginContent = "";
                    }
                } else {
                    email.setError("Fill the input with a valid email address");
                    loginContent = "";
                }
            }
        });
    }


    // RecyclerView implementation
    // get data source
    private void inbox() {
        emails = new ArrayList<>();
        Email email = null;
        for (int i = 0; i < 25; i++) {
            email = new Email(0, "Magda " + i, "Hello Android " + i, "This is an intro about Android");
            //emails.add(email);
        }
    }

    // set the layout manager, in our case LinearLayoutManager because it's a list of emails
    private void setEmailsLayoutManager() {
        recyclerViewEmails = findViewById(R.id.recyclerViewEmails);
        recyclerViewEmails.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setEmailsAdapter() {
        //recyclerViewEmails.setAdapter(new EmailAdapter(this, emails));
    }

    private void displayEmailsList() {
        inbox();
        setEmailsLayoutManager();
        setEmailsAdapter();
    }

    // Spinner implementation
    // step 1 = get the data source for the Spinner
    private List<String> getSpinnerAndroidDataSource() {
        List<String> androidVersions = new ArrayList<>();
        androidVersions.add("Cupcake");
        androidVersions.add("Donut");
        androidVersions.add("Eclair");
        androidVersions.add("KitKat");
        androidVersions.add("Pie");
        return androidVersions;
    }

    // step 2 = get the adapter
    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getSpinnerAndroidDataSource());
    }

    // step 3 = set the adapter to the spinner
    private void setupSpinnerAdapter() {
        spinnerAndroidVersions = findViewById(R.id.spinnerAndroidVersions);
        spinnerAndroidVersions.setAdapter(getSpinnerAdapter());
        // let the Spinner to know that we implemented the setOnItemSelectedListener event at the Activity level
        spinnerAndroidVersions.setOnItemSelectedListener(this);
    }

    private void loadUrlInWebView() {
        webViewAndroid = findViewById(R.id.webViewAndroid);
        WebSettings webSettings = webViewAndroid.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewAndroid.loadUrl(ANDROID_DOCS);
    }

    private void displayViewsSample1() {
        oneTextView = findViewById(R.id.firstTextView);
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

        buttonGetContent = findViewById(R.id.buttonGetContent);
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

    // params: list, child, position, adapter.getItemId(position)
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long itemId) {
        List<String> androidVersions = getSpinnerAndroidDataSource();
        String selectedVersion = androidVersions.get(position);
        Toast.makeText(MainActivity.this, selectedVersion, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
