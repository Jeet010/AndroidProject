package com.example.tamoghna.scroll;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;

public class NotifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
    }

    public void Notify(View view) {
        NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("(5)Missed Call");
        builder.setContentText("Jeet");
        builder.setSmallIcon(R.drawable.eden);
        Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
        inboxStyle.addLine("Click Here");
        builder.setStyle(inboxStyle);
        Intent i = new Intent(this, SimpleActivity.class);
        TaskStackBuilder task = TaskStackBuilder.create(this);
        task.addParentStack(SimpleActivity.class);
        task.addNextIntent(i);
        PendingIntent pi = task.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT, null);
        builder.setContentIntent(pi);
        Notification n=builder.build();
        nm.notify(5,n);
    }
}
