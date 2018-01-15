package com.example.tamoghna.tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s;
    Button b;
    String[] states= {"Andhra Pradesh (AP)", "Arunachal Pradesh (AR)", "Assam (AS)", "Bihar (BR)", "Chhattisgarh (CG)", "Goa (GA)", "Gujarat (GJ)", "Haryana (HR)", "Himachal Pradesh (HP)", "Jammu and Kashmir (JK)", "Jharkhand (JH)", "Karnataka (KA)", "Kerala (KL)", "Madhya Pradesh (MP)", "Maharashtra (MH)", "Manipur (MN)", "Meghalaya (ML)", "Mizoram (MZ)", "Nagaland (NL)", "Odisha(OR)", "Punjab (PB)", "Rajasthan (RJ)", "Sikkim (SK)", "Tamil Nadu (TN)", "Telangana (TS)", "Tripura (TR)", "Uttar Pradesh (UP)", "Uttarakhand (UK)", "West Bengal (WB)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,states);
        s= (Spinner)findViewById(R.id.spinner);
        b= (Button)findViewById(R.id.button);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i)
        {
            case 0:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(MainActivity.this, APActivity.class);
                        startActivity(i);
                    }
                });
                break;
            case 1:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,ar.class);
                        startActivity(i);
                    }
                });
                break;
            case 2:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,as.class);
                        startActivity(i);
                    }
                });
                break;
            case 3:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,br.class);
                        startActivity(i);
                    }
                });
                break;
            case 4:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,cg.class);
                        startActivity(i);
                    }
                });
                break;
            case 5:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,ga.class);
                        startActivity(i);
                    }
                });
                break;
            case 6:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,gj.class);
                        startActivity(i);
                    }
                });
                break;
            case 7:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,hr.class);
                        startActivity(i);
                    }
                });
                break;
            case 8:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,hp.class);
                        startActivity(i);
                    }
                });
                break;
            case 9:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,jk.class);
                        startActivity(i);
                    }
                });
                break;
            case 10:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,jh.class);
                        startActivity(i);
                    }
                });
                break;
            case 11:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,ka.class);
                        startActivity(i);
                    }
                });
                break;
            case 12:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,kl.class);
                        startActivity(i);
                    }
                });
                break;
            case 13:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,mp.class);
                        startActivity(i);
                    }
                });
                break;
            case 14:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,mh.class);
                        startActivity(i);
                    }
                });
                break;
            case 15:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,mn.class);
                        startActivity(i);
                    }
                });
                break;
            case 16:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,ml.class);
                        startActivity(i);
                    }
                });
                break;
            case 17:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,mz.class);
                        startActivity(i);
                    }
                });
                break;
            case 18:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,nl.class);
                        startActivity(i);
                    }
                });
                break;
            case 19:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,or.class);
                        startActivity(i);
                    }
                });
                break;
            case 20:
                break;
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,pb.class);
                        startActivity(i);
                    }
                });
                break;
            case 21:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,rj.class);
                        startActivity(i);
                    }
                });
                break;
            case 22:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,sk.class);
                        startActivity(i);
                    }
                });
                break;
            case 23:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,tn.class);
                        startActivity(i);
                    }
                });
                break;
            case 24:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,ts.class);
                        startActivity(i);
                    }
                });
                break;
            case 25:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,tr.class);
                        startActivity(i);
                    }
                });
                break;
            case 26:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,up.class);
                        startActivity(i);
                    }
                });
                break;
            case 27:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,uk.class);
                        startActivity(i);
                    }
                });
                break;
            case 28:
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i= new Intent(this,wb.class);
                        startActivity(i);
                    }
                });
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
