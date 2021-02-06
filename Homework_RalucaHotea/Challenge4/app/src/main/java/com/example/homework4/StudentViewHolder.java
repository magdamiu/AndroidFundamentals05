package com.example.homework4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView firstNameText, lastNameText;
    private LinearLayout linearLayoutStudent;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        firstNameText = itemView.findViewById(R.id.firstName_id);
        lastNameText = itemView.findViewById(R.id.lastName_id);
        linearLayoutStudent = itemView.findViewById(R.id.linearLayoutStudent);
    }

    public TextView getFirstNameText() {
        return firstNameText;
    }

    public TextView getLastNameText() {
        return lastNameText;
    }

    public LinearLayout getLinearLayoutStudent() {
        return linearLayoutStudent;
    }
}
