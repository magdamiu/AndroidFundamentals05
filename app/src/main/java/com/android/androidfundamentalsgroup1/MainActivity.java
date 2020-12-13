package com.android.androidfundamentalsgroup1;

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
        setContentView(R.layout.student_view);
        displayStudentsList();
    }

    private void getStudentsData(){
        students = new ArrayList<>();
        Student newStudent;

        for (int i = 0; i < 25; i++) {
            newStudent = new Student("FirstName " + i, "LastName " + i);
            students.add(newStudent);
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
        getStudentsData();
        setStudentsLayoutManager();
        setStudentsAdapter();
    }

}