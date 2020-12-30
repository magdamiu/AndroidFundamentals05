package com.example.tema7plus8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    private final Calendar c = Calendar.getInstance();
    private int year = c.get(Calendar.YEAR);
    private int month = c.get(Calendar.MONTH);
    private int day = c.get(Calendar.DAY_OF_MONTH);
    private TextView date;
    private ImageView battery;
    private int batteryLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.date_picker_text_view);
        battery = findViewById(R.id.battery);
    }

    public void onDatePicker(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {

                        date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                    }
                }, year, month, day);
        datePickerDialog.show();
    }

    public void onPlus(View view) {
        batteryLevel += 1;
        if (batteryLevel > 7)
            batteryLevel = 7;
        battery.setImageLevel(batteryLevel);
    }

    public void onMinus(View view) {
        batteryLevel -= 1;
        if (batteryLevel < 0)
            batteryLevel = 0;
        battery.setImageLevel(batteryLevel);
    }
}