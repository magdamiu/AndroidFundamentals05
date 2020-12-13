package com.android.androidfundamentalsgroup1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private final TextView textViewFirstName, textViewLastName;
    private final LinearLayout linearLayoutStudent;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewFirstName = itemView.findViewById(R.id.textViewFirstName);
        textViewLastName = itemView.findViewById(R.id.textViewLastName);
        linearLayoutStudent = itemView.findViewById(R.id.linearLayoutStudent);
    }

    public TextView getTextViewFirstName() {
        return textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return textViewLastName;
    }

    public LinearLayout getLinearLayoutStudent() {
        return linearLayoutStudent;
    }

}
