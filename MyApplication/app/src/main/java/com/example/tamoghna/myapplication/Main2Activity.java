package com.example.tamoghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2;
    TextView t;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        t = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view == b1) {
            ++a;
            t.setText("counter =" + a);
        }
        if (view == b2) {
            --a;
            t.setText("counter =" + a);
        }
    }
}
