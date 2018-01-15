package in.rcplindia.www.kiitwtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner sp;
    TextView tv;
    String city[] ={"Gaziyabad","Delhi","Jamshedpur","Palamu","Kolkata","Newyork"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sp = (Spinner) findViewById(R.id.spinner);
        tv = (TextView) findViewById(R.id.textView2);
        ArrayAdapter adapter  =
                new ArrayAdapter(this,android.R.layout.simple_spinner_item,city);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tv.setText("Selected : "+city[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
