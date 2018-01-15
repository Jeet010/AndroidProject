package com.example.tamoghna.counterapp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    TextView t;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.textView2);

    }

    public void button1(View view) {
        ++a;
        t.setText("counter ="+a);
    }

    public void button2(View view) {
        --a;
        t.setText("counter ="+a);
    }
}
