package in.rcplindia.www.kiitwtapp;

import android.Manifest;
import android.app.SearchManager;
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

public class IntentDemoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] arr = {"DIAL", "CALL", "SMS", "WEB", "WEB SEARCH", "CONTACT", "GO TO DELHI", "Exit"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);
        ArrayAdapter adapter =
                new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        lv = (ListView) findViewById(R.id.lv1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8750777452"));
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                break;
            case 1:
                String x = "7903495627";
                Intent i2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+x));
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
                startActivity(i2);
                break;
            case 2:
                Intent i3 = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:8750777452"));
                i3.putExtra("sms_body","It is developed by KIITian");
                startActivity(i3);
                break;
            case 3:
                Intent i4 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.rcplindia.in"));
                startActivity(i4);
                break;
            case 4:
                Intent i5 = new Intent(Intent.ACTION_WEB_SEARCH,Uri.parse("http://www.google.com"));
                i5.putExtra(SearchManager.QUERY,"KIIT");
                startActivity(i5);
                break;
            case 5:
                Intent i6 = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(i6);
                break;
            case 6:
                Intent i7 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:28.61, 77.20"));
                startActivity(i7);
                break;
            case 7:
                finish();
        }
    }
}
