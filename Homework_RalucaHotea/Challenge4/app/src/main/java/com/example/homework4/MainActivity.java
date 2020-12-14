package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewStudents;
    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_recycler_view);
        displayStudentList();
    }

    private void inbox() {
        students = new ArrayList<>();
        Student student = null;
        for (int i = 0; i < 25; i++) {
            student = new Student(i, "FirstName" + i, "LastName" + i);
            students.add(student);

        }
    }

    private void setStudentsLayoutManager() {
        recyclerViewStudents = findViewById(R.id.recycleView_id);
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setStudentsAdapter() {
        StudentAdapter studentAdapter = new StudentAdapter(students, this);
        recyclerViewStudents.setAdapter(studentAdapter);
    }

    private void displayStudentList() {
        inbox();
        setStudentsLayoutManager();
        setStudentsAdapter();
    }
}