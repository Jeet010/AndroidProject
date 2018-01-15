package com.example.tamoghna.counterapp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button b1, b2;
    TextView t;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1 = (Button) findViewById(R.id.button4);
        b2 = (Button) findViewById(R.id.button3);
        t = (TextView) findViewById(R.id.textView2);
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