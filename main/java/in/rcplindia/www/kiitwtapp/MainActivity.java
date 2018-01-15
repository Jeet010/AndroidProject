package in.rcplindia.www.kiitwtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    int i = 0;
    TextView tv;
    Button b;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView2);
        b = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv.setText("Counter = "+i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                tv.setText("Counter = "+i);
            }
        });
    }
}










        /*   b.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==b) {
            i++;
            tv.setText("Counter = " + i);
        }
        else
        {
            i--;
            tv.setText("Counter "+i);
        }
    }
}



       */





        /*  Increment obj = new Increment();
        b.setOnClickListener(obj);
        Decrement dobj = new Decrement();
        b2.setOnClickListener(dobj);
    }
    class Increment implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            i++;
            tv.setText("Counter = "+i);
        }
    }
    class Decrement implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            i--;
            tv.setText("Counter = "+i);
        }
    }
}

*/