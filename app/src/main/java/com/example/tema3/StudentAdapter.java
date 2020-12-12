package com.example.tema3;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private Context context;
    private List<Student> students;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentView = LayoutInflater.from(context).inflate(R.layout.student_view, parent, false);
        return new StudentViewHolder(studentView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent = students.get(position);
        holder.getFirstName().setText(currentStudent.getFirstName());
        holder.getLastName().setText(currentStudent.getLastName());

        if (position %2 ==0) {
            holder.getBackground().setBackgroundColor(Color.parseColor("#9BF99C"));
        } else
            holder.getBackground().setBackgroundColor(Color.parseColor("#128477"));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
