package com.example.tamoghna.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuActivity extends ListActivity {
    String[] name={"Jeet", "Shouvik", "Ritwik", "Chandan", "Soumik", "Soutrik"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item1,name);
        setList
    }
}
