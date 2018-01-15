package in.rcplindia.www.kiitwtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
EditText ed1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        ed1 = (EditText) findViewById(R.id.ed1);
        tv = (TextView) findViewById(R.id.tv1);
    }
    public void alok(View v)
    {
        String x = ed1.getText().toString();
        tv.setText("Welcome "+x);
    }
}
