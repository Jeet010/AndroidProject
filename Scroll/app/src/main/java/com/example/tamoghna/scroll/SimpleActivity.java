package com.example.tamoghna.scroll;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SimpleActivity extends AppCompatActivity {
    String[] c={"Black", "White", "Red", "Blue", "Green", "Yellow"};
    String data;
    ArrayList al;
    String[] m={"Don", "Main Hoon Naa", "Dhishoom", "Drishyam", "My Name is Khan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        al= new ArrayList();
    }

    public void SimpleDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("RCPL INDIA");
        builder.setMessage("Do you want to call?");
        builder.setPositiveButton("Call", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SimpleActivity.this, "Open Dialer", Toast.LENGTH_LONG).show();
                Intent in = new Intent(Intent.ACTION_DIAL);
                startActivity(in);
            }
        });
        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SimpleActivity.this, "Cancelled", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();
    }

    public void SingleChoice(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Colours");
        builder.setSingleChoiceItems(c, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                data = c[i];
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SimpleActivity.this, data , Toast.LENGTH_LONG).show();
            }
        });
        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SimpleActivity.this, "Cancelled" , Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();
    }

    public void MultiChoice(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMultiChoiceItems(m, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
               if(b)
               {
                    al.add(m[i]);
               }
               else
               {
                   if(al.contains(m[i]))
                   {
                       al.remove(m[i]);
                   }
               }
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SimpleActivity.this, ""+al , Toast.LENGTH_LONG).show();
            }
        });
        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SimpleActivity.this, "Cancelled" , Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();
    }

    public void Custom(View view) {
        final Dialog d= new Dialog(this);
        d.setContentView(R.layout.custom);
        d.setTitle("Please enter Name");
        d.setCancelable(false);
        Button b = (Button)d.findViewById(R.id.button5);
        final EditText e1= (EditText)d.findViewById(R.id.editText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= e1.getText().toString();
                Toast.makeText(SimpleActivity.this,""+name , Toast.LENGTH_LONG).show();
                d.cancel();
            }
        });
        d.show();
    }
}
