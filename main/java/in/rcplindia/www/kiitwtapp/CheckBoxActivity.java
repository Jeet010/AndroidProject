package in.rcplindia.www.kiitwtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener {
Button b1;
    CheckBox ch1,ch2,ch3,ch4;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        b1 = (Button) findViewById(R.id.button);
        ch1 = (CheckBox) findViewById(R.id.checkBox);
        ch2 = (CheckBox) findViewById(R.id.checkBox2);
        ch3 = (CheckBox) findViewById(R.id.checkBox3);
        ch4 = (CheckBox) findViewById(R.id.checkBox4);
        tv = (TextView) findViewById(R.id.textView2);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ArrayList al = new ArrayList<String>();
        if(ch1.isChecked())
        {
            al.add("Swimming");
        }
        if(ch2.isChecked())
        {
            al.add("Designing");
        }
        if(ch3.isChecked())
        {
            al.add("Sleeping");
        }
        if(ch4.isChecked())
        {
            al.add("Gaming");
        }
        tv.setText("Selected : "+al);
    }
}
