package com.example.codechallenge2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewStudents;

    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        displayStudentsList();
    }

    private void setStudents() {
        students = new ArrayList<>();
        Student student = null;

        for (int i = 0; i < 25; i++) {
            student = new Student(0, "FirstName " + i, "LastName " + i);
            students.add(student);
        }
    }

    private void setStudentsLayoutManager() {
        recyclerViewStudents = findViewById(R.id.viewStudents);
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    private void setStudentsAdapter() {
        recyclerViewStudents.setAdapter(new StudentAdapter(students, this));
    }

    private void displayStudentsList() {
        setStudents();
        setStudentsLayoutManager();
        setStudentsAdapter();
    }
}