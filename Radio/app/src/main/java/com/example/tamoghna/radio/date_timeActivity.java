package com.example.tamoghna.radio;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class date_timeActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        e1= (EditText)findViewById(R.id.editText);
        e2= (EditText)findViewById(R.id.editText2);
        e1.setOnClickListener(this);
        e2.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v == e1) {
            Date d = new Date();
            Mytime obj = new Mytime();
            TimePickerDialog td = new TimePickerDialog(this, obj, d.getHours(), d.getMinutes(), false);
            td.show();
        } else {
            Mydate obj2 = new Mydate();
            Calendar c = Calendar.getInstance();
            DatePickerDialog dp = new DatePickerDialog(this, obj2, c.get(Calendar.YEAR),c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
            dp.show();
        }
    }
        class Mydate implements DatePickerDialog.OnDateSetListener
        {
            public void onDateSet(DatePicker view,int year, int month, int dayofmonth)
            {
                String data=dayofmonth+"/"+(month+1)+"/"+year;
                e2.setText(data);
            }
        }
        class Mytime implements TimePickerDialog.OnTimeSetListener {

            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {

            }

        }
    }

