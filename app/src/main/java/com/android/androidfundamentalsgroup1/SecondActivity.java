package com.android.androidfundamentalsgroup1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private final String TAG = "SecondActivity";
    private TextView textViewTop;

    //code challenge 2
    private RecyclerView recyclerViewStudents;
    private List<Student> students;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
//
//        onInitViews();
//
//        Logging.show(TAG, "onCreate");



        //code challenge 1
         //setContentView(R.layout.code_challenge_no1);

        //code challenge 2
        setContentView(R.layout.code_challenge_no2);
        displayStudentsList();

        //code challenge 3
        setContentView(R.layout.code_challenge_no3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show(TAG, "onStop");
    }

    private void onInitViews() {
        textViewTop = findViewById(R.id.textViewTop);
    }

    public void buttonLeftOnClick(View view) {
        textViewTop.setText("clicked left button");

        // implicit intent for action dial
        Intent implicitIntentCaller = new Intent(Intent.ACTION_DIAL);
        implicitIntentCaller.setData(Uri.parse("tel:0744444444"));
        if (implicitIntentCaller.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntentCaller);
        }
    }

    //code challenge2
    private void displayStudentsList() {
        // data source - checked
        studentsSource();

        // layout manager - checked
        setStudentsLayoutManager();

        // adapter - checked
        setStudentsAdapter();
    }
    // Student RecyclerView
    private void studentsSource() {
        students = new ArrayList<>();
        Student student = null;
        for (int i = 0; i < 30; i++) {
            student = new Student(i, "FirstName" + i, "LastName " + i);
            students.add(student);
        }
    }
    // step 4
    private void setStudentsLayoutManager() {
        recyclerViewStudents = findViewById(R.id.recyclerViewStudents);
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setStudentsAdapter() {
        recyclerViewStudents.setAdapter(new StudentAdapter(this, students));
    }
}