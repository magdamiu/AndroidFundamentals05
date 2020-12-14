package com.android.androidfundamentalsgroup1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewStudents;
    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Code Challange 1
        setContentView(R.layout.layout_1);

        //Code Challange 2
        //setContentView(R.layout.layout_2);
        //displayStudentsList();

        //Code Challange 3
        //setContentView(R.layout.layout_3);
    }

    private void inbox() {
        students = new ArrayList<>();
        Student student = null;
        for (int i = 0; i < 25; i++) {
            student = new Student(0, "FirstName " + i, "LastName " + i);
            students.add(student);
        }
    }

    private void setStudentsLayoutManager() {
        recyclerViewStudents = findViewById(R.id.recyclerViewStudents);
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setStudentsAdapter() {
        recyclerViewStudents.setAdapter(new StudentAdapter(students, this));
    }

    private void displayStudentsList() {
        // data source
        inbox();

        // layout manager - checked
        setStudentsLayoutManager();

        // adapter - checked
        setStudentsAdapter();
    }


}
