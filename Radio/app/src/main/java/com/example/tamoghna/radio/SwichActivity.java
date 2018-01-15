package com.example.tamoghna.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SwichActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1,t2;
    Switch s;
    ToggleButton t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swich);
        t = (ToggleButton)findViewById(R.id.toggleButton2);
        s = (Switch)findViewById(R.id.switch1);
        t1 = (TextView)findViewById(R.id.textView5);
        t2 = (TextView)findViewById(R.id.textView6);
        t.setOnClickListener(this);
        s.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v == t) {
            if (t.isChecked()) {
                t2.setText("Bluetooth is on");
            } else {
                t2.setText("Bluetooth is off");
            }
        } else if (v == s) {
            if (s.isChecked()) {
                t1.setText("WiFi is on");
            } else {
                t1.setText("WiFi is off");
            }
        }

    }
}
