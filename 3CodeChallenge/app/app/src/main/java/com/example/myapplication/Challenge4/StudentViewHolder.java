package com.example.myapplication.Challenge4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView firstNameTextView, lastNameTextView;
    private LinearLayout recyclerViewLinearLayout;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        firstNameTextView = itemView.findViewById(R.id.firstNameTextView);
        lastNameTextView = itemView.findViewById(R.id.lastNameTextView);
        recyclerViewLinearLayout = itemView.findViewById(R.id.recyclerViewLinearLayout);
    }

    public TextView getFirstNameTextView() {
        return firstNameTextView;
    }

    public TextView getLastNameTextView() {
        return lastNameTextView;
    }

    public LinearLayout getRecyclerViewLinearLayout() {
        return recyclerViewLinearLayout;
    }
}
