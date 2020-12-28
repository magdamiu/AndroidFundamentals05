package com.example.codechallange2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;

public class MainActivity2 extends AppCompatActivity {
    ScrollView sv;
    private int offset = 0;

    private final void focusOnView(){
        sv.post(new Runnable() {
            @Override
            public void run() {
                sv.scrollTo(0, offset);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent().hasExtra("selected_paragraph")) {
            offset = getIntent().getIntExtra("selected_paragraph", 0);

            if (offset == 2) {
                offset = 2000;
            } else if (offset == 3) {
                offset = 4000;
            }
        }

        sv = (ScrollView)findViewById(R.id.scrollView_text2);
        focusOnView();
    }
}