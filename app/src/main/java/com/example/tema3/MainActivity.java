package com.example.tema3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> students;
    private RecyclerView recyclerViewStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ex3);
        // displayStudentsList();
    }

    private void generateStudents() {
        students = new ArrayList<>();
        Student student = null;
        for (int i = 0; i < 25; i++) {
            student = new Student("FirstName " + i, "SecondName " + i);
            students.add(student);
        }
    }

    private void setStudentsLayoutManager() {
        recyclerViewStudents = findViewById(R.id.recycler_view);
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setStudentsAdapter() {
        recyclerViewStudents.setAdapter(new StudentAdapter(this, students));
    }

    private void displayStudentsList() {
        generateStudents();
        setStudentsLayoutManager();
        setStudentsAdapter();
    }
}