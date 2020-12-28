package com.example.codechallange2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    ScrollView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.text_one_button);
        button2 = (Button) findViewById(R.id.text_two_button);
        button3 = (Button) findViewById(R.id.text_three_button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity1.class);
        intent.putExtra("selected_paragraph", 3);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("selected_paragraph", 2);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("selected_paragraph", 1);
        startActivity(intent);
    }
}