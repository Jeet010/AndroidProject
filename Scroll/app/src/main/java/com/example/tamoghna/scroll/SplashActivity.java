package com.example.tamoghna.scroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        class MyThread extends Thread{
            public void run()
            {
                try {
                    Thread.sleep(5000);
                    Intent i = new Intent(SplashActivity.this, SimpleActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        MyThread my = new MyThread();
        my.start();
    }
}
