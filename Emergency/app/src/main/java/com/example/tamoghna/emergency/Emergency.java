package com.example.tamoghna.emergency;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Emergency extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] arr = {"Police", "Fire", "Ambulance", "Gas leakage", "Tourist Helpline", "Child Helpline", "Blood Requirement", "Helpline for Women"};
    ListView l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        l1 = (ListView) findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Toast t=Toast.makeText(this, "Calling"+arr[position], Toast.LENGTH_SHORT);
        t.show();
        switch (position) {
            case 0:
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:100"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(i);
                break;
            case 1:
                Intent i1 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:100"));
                startActivity(i1);
                break;
            case 2:
                Intent i2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:102"));
                startActivity(i2);
                break;
            case 3:
                Intent i3 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:1906"));
                startActivity(i3);
                break;
            case 4:
                Intent i4 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:1363"));
                startActivity(i4);
                break;
            case 5:
                Intent i5 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:1098"));
                startActivity(i5);
                break;
            case 6:
                Intent i6 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:104"));
                startActivity(i6);
                break;
            case 7:
                Intent i7 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:181"));
                startActivity(i7);
                break;
        }
        }
}
