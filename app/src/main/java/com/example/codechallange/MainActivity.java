package com.example.codechallange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String firstNames[], lastNames[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

        // !!! UNCOMMENT FOR CODE CHALLANGE 2 !!!!
//        recyclerView = findViewById(R.id.recyclerView);
//
//        firstNames = getResources().getStringArray(R.array.first_name);
//        lastNames = getResources().getStringArray(R.array.last_name);
//
//        Adapter adapter = new Adapter(this, firstNames, lastNames);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}