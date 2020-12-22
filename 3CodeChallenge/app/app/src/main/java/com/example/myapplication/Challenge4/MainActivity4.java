package com.example.myapplication.Challenge4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private List<Student> students;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.android_layout);

        //setContentView(R.layout.student_recycler_view);
        //displayStudentsList();

        setContentView(R.layout.constraint_layout);
    }

    public void inbox() {
        students = new ArrayList<>();
        Student student = null;
        for (int i = 1; i < 15; i++) {
            student = new Student(i, "FirstName " + i, "LastName " + i);
            students.add(student);
        }
    }

    public void setStudentsLayoutManager() {
        recyclerView = findViewById(R.id.studentRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setStundentsAdapter() {
        recyclerView.setAdapter(new StudentAdapter(students, this));
    }

    public void displayStudentsList() {
        inbox();
        setStudentsLayoutManager();
        setStundentsAdapter();
    }
}