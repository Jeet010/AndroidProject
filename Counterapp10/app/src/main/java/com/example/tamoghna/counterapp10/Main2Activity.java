package com.example.tamoghna.counterapp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText ed;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.textView);
    }

    public void Jeet(View view)
    {
        String x=ed.getText().toString();
        tv.setText("Welcome "+x);
    }
}
