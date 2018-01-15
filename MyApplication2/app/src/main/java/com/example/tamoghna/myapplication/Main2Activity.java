package com.example.tamoghna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText e1, e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=(EditText)findViewById(R.id.editText6);
        e2=(EditText)findViewById(R.id.editText7);
        b1=(Button)findViewById(R.id.button20);
        b1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        String name=e1.getText().toString();
        String pass=e2.getText().toString();
        Intent i = new Intent(this,LoginResultActivity.class);
        i.putExtra("U",name);
        i.putExtra("P",pass);
        Toast t=Toast.makeText(this, "Logged in", Toast.LENGTH_LONG);
        t.show();
        startActivity(i);
    }
}
