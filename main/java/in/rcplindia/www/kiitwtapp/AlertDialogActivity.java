package in.rcplindia.www.kiitwtapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AlertDialogActivity extends AppCompatActivity {
String col[] ={"RED","BLACK","PINK","WHITE","BLUE","GREEN"};
    String movie[] = {"Golmal Return","Fukrey","Tiger Zinda hai","DDLJ"};
    ArrayList al;
    String data= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
    }
    public void simpleDialog(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.download);
        builder.setTitle("RCPL INDIA");
        builder.setMessage("Do you want to call ??");
        builder.setPositiveButton("Call", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this,"Open Dialer",Toast.LENGTH_LONG).show();
            }
        });
        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this,"Cancel Clicked",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void singleChoice(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.newyork);
        builder.setTitle("Selec Your Color");
        //builder.setMessage("Please select Fav Color");
        builder.setSingleChoiceItems(col, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                data = col[which];
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this,data,Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this,"Cancel",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void multiChoice(View v)
    {
        al = new ArrayList();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.pic5);
        builder.setTitle("Select Your Fav Movies");
        builder.setMultiChoiceItems(movie, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if(isChecked)
                {
                    al.add(movie[which]);
                }
                else
                {
                    if(al.contains(movie[which]))
                    {
                        al.remove(movie[which]);
                    }
                }
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this,""+al,Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void customDialog(View v)
    {
       final Dialog d = new Dialog(this);
        d.setTitle("Please Input Name");
        d.setContentView(R.layout.custom);
        d.setCancelable(false);
        Button b = (Button) d.findViewById(R.id.button2);
        final EditText et1 = (EditText) d.findViewById(R.id.editText1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString();
                Toast.makeText(AlertDialogActivity.this,name,Toast.LENGTH_LONG).show();
                d.cancel();
            }
        });
        d.show();
    }
}
