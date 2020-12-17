package com.example.tema3;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private final TextView firstName;
    private final TextView lastName;
    private final LinearLayout background;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName = itemView.findViewById(R.id.first_name);
        lastName = itemView.findViewById(R.id.last_name);
        background = itemView.findViewById(R.id.background_student);
    }

    public TextView getFirstName() {
        return firstName;
    }

    public TextView getLastName() {
        return lastName;
    }

    public LinearLayout getBackground() {
        return background;
    }
}
