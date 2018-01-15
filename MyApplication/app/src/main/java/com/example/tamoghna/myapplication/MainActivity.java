package com.example.tamoghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    TextView t;
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        t = (TextView) findViewById(R.id.textView);
        Increment ob1 = new Increment();
        Decrement ob2 = new Decrement();
        b1.setOnClickListener(ob1);
        b2.setOnClickListener(ob2);
    }
    class Increment implements View.OnClickListener {
        public void onClick(View view) {
            ++a;
            t.setText("counter =" + a);
        }
    }

    class Decrement implements View.OnClickListener {
        public void onClick(View view) {
            --a;
            t.setText("counter =" + a);
        }
    }
}
