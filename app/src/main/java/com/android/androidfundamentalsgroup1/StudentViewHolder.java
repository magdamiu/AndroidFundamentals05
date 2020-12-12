package com.android.androidfundamentalsgroup1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private final TextView firstName, lastName;
    private final LinearLayout linearLayoutStudent;


    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName = itemView.findViewById(R.id.student_first_name);
        lastName = itemView.findViewById(R.id.student_last_name);
        linearLayoutStudent = itemView.findViewById(R.id.linear_layout_student);
    }

    public TextView getFirstName() {
        return firstName;
    }

    public TextView getLastName() {
        return lastName;
    }

    public LinearLayout getLinearLayoutStudent() {
        return linearLayoutStudent;
    }
}
