package com.example.tamoghna.scroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    SeekBar s;
    TextView t;
    Button b;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);
        s = (SeekBar)findViewById(R.id.seekBar);
        t = (TextView)findViewById(R.id.textView2);
        s.setOnSeekBarChangeListener(this);
        b = (Button)findViewById(R.id.button8);
        b.setOnClickListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        i=progress;
        t.setText("Progress "+progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this,"Started",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this,"Stopped",Toast.LENGTH_LONG).show();
    }
    public void onClick(View v)
    {
        class MyThread extends Thread
        {
            public void run()
            {
                for(i=0; i<100;i++)
                {
                    try {
                        Thread.sleep(1000);
                        s.setProgress(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        MyThread my = new MyThread();
        my.start();
    }
}
