package in.rcplindia.www.kiitwtapp;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
RadioGroup rg;
    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        rg = (RadioGroup) findViewById(R.id.rg1);
        b = (Button) findViewById(R.id.button3);
        tv = (TextView) findViewById(R.id.textView2);
        rg.setOnCheckedChangeListener(this);
        b.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        String data="";
        switch (checkedId)
        {
            case R.id.radioButton1:
                data="CSCE";
                break;
            case R.id.radioButton2 :
                data = "ECE";
                break;
            case R.id.radioButton3:
                data = "IT";
                break;
            case R.id.radioButton4:
                data = "EEE";
                break;
        }
        tv.setText("Selected : "+data);
    }

    @Override
    public void onClick(View v) {
        rg.clearCheck();
        tv.setText("Selected  : ");
    }
}
