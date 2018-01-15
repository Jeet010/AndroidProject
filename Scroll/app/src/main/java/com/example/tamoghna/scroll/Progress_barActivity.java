package com.example.tamoghna.scroll;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Progress_barActivity extends AppCompatActivity{
    ProgressBar p;
    Button b, b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        p = (ProgressBar)findViewById(R.id.progressBar2);
        p.setMax(100);
        b = (Button)findViewById(R.id.button9);
        b1 = (Button)findViewById(R.id.button10);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog p = new ProgressDialog(Progress_barActivity.this);
                p.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                p.setMax(100);
                p.show();
                class LoadThread extends Thread
                {
                    public void run()
                    {
                        for(int i=0; i<100; i++)
                        {
                            p.setProgress(i);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        p.cancel();
                    }
                }
                LoadThread l = new LoadThread();
                l.start();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class DownloadThread extends Thread
                {
                    public void run()
                    {
                        for(int i=0;i<100;i++)
                        {
                            p.setProgress(i);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                DownloadThread d = new DownloadThread();
                d.start();
            }
        });

    }
}
