package in.rcplindia.www.kiitwtapp;

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

public class DateTimeActivity extends AppCompatActivity implements View.OnClickListener {
EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        ed1 = (EditText) findViewById(R.id.editText3);
        ed2  = (EditText) findViewById(R.id.editText4);
        ed1.setOnClickListener(this);
        ed2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==ed1) {
            Date d = new Date();
            MyTime obj = new MyTime();
            TimePickerDialog td = new TimePickerDialog(this, obj, d.getHours(), d.getMinutes(), true);
            td.show();
        }
        else
        {
            MyDate obj2  =new MyDate();
            Calendar c = Calendar.getInstance();
            DatePickerDialog dp = new DatePickerDialog(this,
             obj2,c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH));
            dp.show();
        }
    }
    class MyDate implements DatePickerDialog.OnDateSetListener {

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            String data = dayOfMonth+"/"+(month+1)+"/"+year;
            ed2.setText(data);
        }
    }
    class MyTime implements TimePickerDialog.OnTimeSetListener{

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            String data =hourOfDay+"--"+minute;
            ed1.setText(data);
        }
    }
}
