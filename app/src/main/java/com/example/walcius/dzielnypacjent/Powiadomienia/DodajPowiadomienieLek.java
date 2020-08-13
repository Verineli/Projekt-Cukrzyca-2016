package com.example.walcius.dzielnypacjent.Powiadomienia;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.example.walcius.dzielnypacjent.BaseActivity;
import com.example.walcius.dzielnypacjent.Pomocnik.AlarmService;
import com.example.walcius.dzielnypacjent.R;

import java.util.Calendar;

public class DodajPowiadomienieLek extends BaseActivity {

    AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private TimePicker alarmTimePicker;
    Spinner spinLeki;
    ToggleButton pn;
    ToggleButton wt;
    ToggleButton sr;
    ToggleButton czw;
    ToggleButton pt;
    ToggleButton sob;
    ToggleButton nd;
    private static DodajPowiadomienieLek inst;
    public static DodajPowiadomienieLek instance()
    {return inst;}
    @Override
    public void onStart(){
        super.onStart();
        inst = this;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_powiadomienie_lek);
        alarmTimePicker = (TimePicker)findViewById(R.id.timePicker);
        alarmTimePicker.setIs24HourView(true);
        spinLeki = (Spinner)findViewById(R.id.spinLeki);
        pn = (ToggleButton)findViewById(R.id.tButPn);
        wt = (ToggleButton)findViewById(R.id.tButWt);
        sr = (ToggleButton)findViewById(R.id.tButSr);
        czw = (ToggleButton)findViewById(R.id.tButCzw);
        pt = (ToggleButton)findViewById(R.id.tButPt);
        sob = (ToggleButton)findViewById(R.id.tButSob);
        nd = (ToggleButton)findViewById(R.id.tButNd);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    }

    public void DodajAlarm (View view){
        Log.d("MyActivity", "Alarm On");
        AlarmManager man = (AlarmManager)DodajPowiadomienieLek.this.getSystemService(Context.ALARM_SERVICE);
        Intent i = new Intent(DodajPowiadomienieLek.this,AlarmService.class);
        PendingIntent pi = PendingIntent.getService(DodajPowiadomienieLek.this, 0, i, 0);
        Calendar calendar = Calendar.getInstance();
            //calendar.set(Calendar.DAY_OF_WEEK, 1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
        calendar.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());
        man.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),pi);





    }
}
