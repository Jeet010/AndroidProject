package com.example.tamoghna.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {
    TextView t;
    Spinner s;
    String[] city={"Kolkata", "Durgapur", "Asansol", "Bhubneshwar", "Delhi", "Mumbai", "Bangalore", "Pune", "Ahmedabad", "Kochi", "Jamshedpur", "New York", "London", "Washingon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        t = (TextView)findViewById(R.id.textView8);
        s = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,city);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        t.setText("Selected: "+city[position]);

    }
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}
