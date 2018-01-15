package com.example.tamoghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;
    EditText e1, e2;
    TextView t;
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button7);
        b2 = (Button) findViewById(R.id.button8);
        b3 = (Button) findViewById(R.id.button9);
        b4 = (Button) findViewById(R.id.button10);
        t = (TextView) findViewById(R.id.textView4);
        e1= (EditText)findViewById(R.id.editText);
        e2= (EditText)findViewById(R.id.editText2);
    }
    public void add(View view)
    {
        int x=Integer.parseInt(e1.getText().toString());
        int y=Integer.parseInt(e2.getText().toString());
        t.setText("Result = "+(x+y));
    }
    public void subtract(View view)
    {
        int x=Integer.parseInt(e1.getText().toString());
        int y=Integer.parseInt(e2.getText().toString());
        t.setText("Result = "+(x-y));
    }
    public void multiply(View view)
    {
        int x=Integer.parseInt(e1.getText().toString());
        int y=Integer.parseInt(e2.getText().toString());
        t.setText("Result = "+(x*y));
    }
    public void divide(View view)
    {
        int x=Integer.parseInt(e1.getText().toString());
        int y=Integer.parseInt(e2.getText().toString());
        t.setText("Result = "+(x/y));
    }
}
