package com.example.tamoghna.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class APActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] city={"Tirupati",  "Vijayawada", "Vishakapatnam"};
    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, city);
        l1 = (ListView) findViewById(R.id.l1);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    switch (i)
    {
        case 0:
            Intent tirupati= new Intent(this, TirupatiActivity.class);
            startActivity(tirupati);
            break;
        case 1:
            Intent vijayawada= new Intent(this, VijayawadaActivity.class);
            startActivity(vijayawada);
            break;
        case 2:
            Intent vishakapatnam= new Intent(this, VishakapatnamActivity.class);
            startActivity(vishakapatnam);
            break;
    }
    }
}
