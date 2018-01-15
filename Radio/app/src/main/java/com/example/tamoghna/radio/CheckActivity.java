package com.example.tamoghna.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t;
    Button b;
    CheckBox c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        b=(Button)findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.textView4);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox4);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        ArrayList a1 = new ArrayList<String>();
        if(c1.isChecked())
        {
            a1.add("Playing");
        }
        if(c2.isChecked())
        {
            a1.add("Gaming");
        }
        if(c3.isChecked())
        {
            a1.add("Coding");
        }
        if(c4.isChecked())
        {
            a1.add("Sleeping");
        }
        t.setText("Selected: "+a1);
    }
}
