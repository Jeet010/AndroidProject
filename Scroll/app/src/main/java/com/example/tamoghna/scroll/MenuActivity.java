package com.example.tamoghna.scroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuItem item = menu.add(0,0,0,"Add");
        MenuItem item2= menu.add(0,1,1,"Delete");
        MenuItem item3= menu.add(0,2,2,"Edit");
        MenuItem item4= menu.add(0,3,3,"About");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id)
        {
            case 0:
                Toast.makeText(this, "Add Clicked", Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(this, "Delete Clicked", Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this, "Edit Clicked", Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(this, "About Clicked", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
