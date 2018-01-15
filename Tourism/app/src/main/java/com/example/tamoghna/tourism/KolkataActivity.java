package com.example.tamoghna.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class KolkataActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] s ={"Sunderbans", "Victoria Memorial", "Eden Gardens"};
    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, s);
        l1 = (ListView) findViewById(R.id.lv);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Toast t = Toast.makeText(this, "Viewing " + s[position], Toast.LENGTH_LONG);
        t.show();
        switch (position) {
            case 0:
                Intent i = new Intent(this, SunderbanActivity.class);
                startActivity(i);
                break;
            case 1:
                Intent i1 = new Intent(this, VictoriaActivity.class);
                startActivity(i1);
                break;
            case 2:
                Intent i2 = new Intent(this, EdenActivity.class);
                startActivity(i2);
        }
    }
}
