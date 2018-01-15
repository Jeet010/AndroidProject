package in.rcplindia.www.kiitwtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleSwitchActivity extends AppCompatActivity implements View.OnClickListener {
ToggleButton tb;
    Switch sw;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_switch);
        tb = (ToggleButton) findViewById(R.id.toggleButton2);
        sw  = (Switch) findViewById(R.id.switch1);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tb.setOnClickListener(this);
        sw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==tb)
        {
            if(tb.isChecked())
            {
                tv2.setText("TOGGLE IS ONN");
            }
            else
            {
                tv2.setText("TOGGLE IS OFF");
            }
        }
        else {
            if(sw.isChecked())
            {
                tv1.setText("SWITCH IS ON");
            }
            else
            {
                tv1.setText("SWITCH IS OFF");
            }
        }
    }
}
