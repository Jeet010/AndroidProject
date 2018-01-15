package com.example.tamoghna.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    TextView t;
    Button b;
    RadioGroup r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        t= (TextView)findViewById(R.id.textView2);
        r = (RadioGroup) findViewById(R.id.rg1);
        b = (Button) findViewById(R.id.button);
        r.setOnCheckedChangeListener(this);
        b.setOnClickListener(this);
    }
    public void onCheckedChanged(RadioGroup group, int checkedid)
    {
        String data="";
        switch (checkedid)
        {
            case  R.id.radioButton:
                data="CSE";
                break;
            case  R.id.radioButton2:
                data="IT";
                break;
            case  R.id.radioButton3:
                data="CSCE";
                break;
            case  R.id.radioButton4:
                data="CSSE";
                break;
        }
        t.setText("Selected : "+data);
    }
    public void onClick(View view)
    {
        r.clearCheck();
        t.setText("Selected :");
    }
}
