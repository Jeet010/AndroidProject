package in.rcplindia.www.kiitwtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class SuggestionActivity extends AppCompatActivity {
AutoCompleteTextView act;
    String name[]={"Alok","Abhishek","Abhishesh","Abhinash","Abhinav","Aman","Santosh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,name);
        act.setAdapter(adapter);
        act.setThreshold(0);
    }
}
