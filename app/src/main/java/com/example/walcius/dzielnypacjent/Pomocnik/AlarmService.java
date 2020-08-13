package com.example.walcius.dzielnypacjent.Pomocnik;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;

import com.example.walcius.dzielnypacjent.Powiadomienia.DodajPowiadomienieLek;
import com.example.walcius.dzielnypacjent.R;

/**
 * Created by Walcius on 2016-04-13.
 */
public class AlarmService extends IntentService{

    public AlarmService(){
        super("My Service");
    }

    @Override
    protected void onHandleIntent(Intent intent){

        Intent myIntent = new Intent(this, DodajPowiadomienieLek.class);
        // Intent pendingIntent = PendingIntent.getBroadcast(MainAc, 0, myIntent, 0);
        //alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
        Notification n = new Notification.Builder(this)
                .setContentTitle("Wez leki").setSmallIcon(R.drawable.ic_info_black_24dp).setContentText("Wez je!").build();
        NotificationManager m = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        n.flags |= Notification.FLAG_AUTO_CANCEL;
        m.notify(0,n);


    }
}
