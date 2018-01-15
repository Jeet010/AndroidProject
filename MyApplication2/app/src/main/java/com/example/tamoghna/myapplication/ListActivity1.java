package com.example.tamoghna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity1 extends android.app.ListActivity {
    String[] name={"Calculator", "Login"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,name);
        setListAdapter(adapter);
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        Toast t=Toast.makeText(this, "Clicked on"+name[position], Toast.LENGTH_LONG);
        t.show();
        if(position==0)
        {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else if(position==1)
        {
            Intent i = new Intent(this,Main2Activity.class);
            startActivity(i);
        }
    }
}
