package in.rcplindia.www.kiitwtapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity {
String[] name = {"Alok","Anup","Deepak","Faiz","Amit","Sachin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter =
          new ArrayAdapter(this,android.R.layout.simple_list_item_1,name);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast t = Toast.makeText(this,"Click on"+name[position],Toast.LENGTH_LONG);
        t.show();
    }
}
