package com.android.androidfundamentalsgroup1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewFirstName, textViewLastName;
    private LinearLayout linearLayoutStudentItem;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewFirstName = itemView.findViewById(R.id.textViewFirstName);
        textViewLastName = itemView.findViewById(R.id.textViewLastName);
        linearLayoutStudentItem = itemView.findViewById(R.id.linearLayoutStudentItem);
    }

    public TextView getTextViewFirstName() {
        return textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return textViewLastName;
    }

    public LinearLayout getLinearLayoutStudentItem() {
        return linearLayoutStudentItem;
    }
}
