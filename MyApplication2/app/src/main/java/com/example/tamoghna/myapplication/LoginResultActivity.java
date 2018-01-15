package com.example.tamoghna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginResultActivity extends AppCompatActivity {
    TextView t1, t2, t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);
        t1=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.textView5);
        t3=(TextView)findViewById(R.id.textView7);
        Bundle b = getIntent().getExtras();
        String x= b.getString("U");
        String p= b.getString("P");
        if(x.equals(p)) {
            t1.setText("Name = " + x);
            t2.setText("Pass = " + p);
            t3.setText("Login Successful.");
        }
        else{
            t1.setText("Name = " + x);
            t2.setText("Pass = " + p);
            t3.setText("Login not Successful.");
        }

    }
}
