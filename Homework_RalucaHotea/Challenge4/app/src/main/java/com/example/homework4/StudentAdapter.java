package com.example.homework4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private List<Student> students;
    private Context context;

    public StudentAdapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }


    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.student_item, parent, false);
        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        Student currentStudent = students.get(position);
        holder.getFirstNameText().setText(currentStudent.getFirstName());
        holder.getLastNameText().setText(currentStudent.getLastName());
        System.out.println(position);
        if (position % 2 == 0) {
            holder.getLinearLayoutStudent().setBackgroundColor(Color.parseColor("#900c3e"));
        }

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
