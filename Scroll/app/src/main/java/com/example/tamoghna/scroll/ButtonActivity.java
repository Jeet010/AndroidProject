package com.example.tamoghna.scroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        b = (Button)findViewById(R.id.button7);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Intent i = new Intent(this,SplashActivity.class);
        startActivity(i);
    }
}
