package in.rcplindia.www.kiitwtapp;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class NotifiactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifiaction);
    }
    public void simple(View v)
    {
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.download);

        builder.setContentTitle("(38)Missed Call");
        builder.setContentText(" Sona");
        builder.setOngoing(true);
        Intent i = new Intent(this,MainActivity.class);
        TaskStackBuilder task = TaskStackBuilder.create(this);
        task.addParentStack(MainActivity.class);
        task.addNextIntent(i);
        PendingIntent pi=task.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT,null);
        builder.setContentIntent(pi);
/*
        Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
        inboxStyle.addLine("Line no1");
        inboxStyle.addLine("Alok Kumar Pandey");
        inboxStyle.addLine("RCPL Noida");
        inboxStyle.addLine("Pyara KiiT");
        builder.setStyle(inboxStyle);


Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
        bigPictureStyle.bigPicture(BitmapFactory.decodeResource
        (getResources(),R.drawable.pic5));
        builder.setStyle(bigPictureStyle);
*/

Notification.Action action = new Notification.Action(R.drawable.download,"call",pi);
builder.addAction(action);


        Notification n = builder.build();
        nm.notify(5,n);

    }
}
