package com.example.codechallange;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    String fNames[], lNames[];
    Context context;
    int numberForBackground = 0;

    public Adapter(Context ct, String fN[], String lN[]) {
        context = ct;
        fNames = fN;
        lNames = lN;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_recyclerview_row, parent, false);

        if (numberForBackground % 2 != 0) {
            view.findViewById(R.id.card_view).setBackgroundColor(Color.GRAY);
        }
        numberForBackground += 1;

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text1.setText(fNames[position]);
        holder.text2.setText(lNames[position]);
    }

    @Override
    public int getItemCount() {
        return fNames.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.first_name_txt);
            text2 = itemView.findViewById(R.id.last_name_txt);

        }
    }
}
