package com.example.tamoghna.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ACTVActivity extends AppCompatActivity {
    AutoCompleteTextView t;
    String[] name={"Alok", "Abhishek", "Abhinash", "Anmol", "Amrita", "Shreya", "Ankita", "Ankur", "Ankan", "Ayush", "Ayan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv);
        t = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,name);
        t.setAdapter(adapter);
        t.setThreshold(0);
    }

}
