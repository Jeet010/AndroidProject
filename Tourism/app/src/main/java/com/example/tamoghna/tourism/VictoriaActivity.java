package com.example.tamoghna.tourism;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VictoriaActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victoria);
        t1 = (TextView) findViewById(R.id.textView9);
        t2 = (TextView) findViewById(R.id.textView10);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view == t1) {
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9475362289"));
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
        }
        else if(view == t2){
            Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Victoria_Memorial,_Kolkata"));
            startActivity(i);
        }
    }
}
