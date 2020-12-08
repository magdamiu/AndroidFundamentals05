package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner versionSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_spinner);
        setSpinnerAdapter();
    }

    private List<String> getVersionSpinnerData(){
        List<String> versions = new ArrayList<String>();

        versions.add("Cupcake");
        versions.add("Donut");
        versions.add("Eclair");
        versions.add("KitKat");
        versions.add("Pie");

        return versions;
    }

    private ArrayAdapter<String> getSpinnerAdapter(){
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getVersionSpinnerData());
    }

    private void setSpinnerAdapter(){
        versionSpinner = findViewById(R.id.versionSpinner);
        versionSpinner.setAdapter(getSpinnerAdapter());
        versionSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        List<String> versions = getVersionSpinnerData();
        String selectedVersion = versions.get(position);
        Toast.makeText(this, getString(R.string.selected) + " " + selectedVersion, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}