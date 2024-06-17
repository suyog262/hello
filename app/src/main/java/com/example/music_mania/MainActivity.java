package com.example.music_mania;

import static android.app.ProgressDialog.show;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    DatePicker date ;
    TimePicker time;
    int month;
    int year;
    int date1;
    int hours;
    int sec;
    int min;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);//provodes contentjava poiints to activity_main
        date=findViewById(R.id.date);
        time=findViewById(R.id.time);

        hours=time.getHour();
        min=time.getMinute();

        month=date.getMonth();
        year=date.getYear();
        date1=date.getDayOfMonth();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



    }

    public void btn(View view) {
        Toast.makeText(this,"The selected date is "+date1+"/"+month+"/"+year+"\n",Toast.LENGTH_SHORT).show();

    }
    public void btn2(View view) {
        Toast.makeText(this,"The selected date is "+hours+"/"+min+"/"+"\n",Toast.LENGTH_SHORT).show();

    }
    

}