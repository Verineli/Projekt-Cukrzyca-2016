package com.example.walcius.dzielnypacjent.Powiadomienia;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.example.walcius.dzielnypacjent.R;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DodajPowiadomienieLekFragment extends Fragment {


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
    private static DodajPowiadomienieLekFragment inst;
    public static DodajPowiadomienieLekFragment instance()
    {return inst;}

    public DodajPowiadomienieLekFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart(){
        super.onStart();
        inst = this;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        timePicker = (TimePicker)getView().findViewById(R.id.timePicker);
        View v = inflater.inflate(R.layout.fragment_dodaj_powiadomienie_lek, container, false);
       /* alarmTimePicker = (TimePicker)v.findViewById(R.id.timePicker);
        alarmTimePicker.setIs24HourView(true);
        spinLeki = (Spinner)v.findViewById(R.id.spinLeki);
        pn = (ToggleButton)v.findViewById(R.id.tButPn);
        wt = (ToggleButton)v.findViewById(R.id.tButWt);
        sr = (ToggleButton)v.findViewById(R.id.tButSr);
        czw = (ToggleButton)v.findViewById(R.id.tButCzw);
        pt = (ToggleButton)v.findViewById(R.id.tButPt);
        sob = (ToggleButton)v.findViewById(R.id.tButSob);
        nd = (ToggleButton)v.findViewById(R.id.tButNd);*/
        return v;
    }

    public void Zapisz (View view){
        //Log.d("MyActivity", "Alarm On");
        if (pn.isChecked()) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DAY_OF_WEEK, 1);
            calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
            calendar.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());
          //  Intent myIntent = new Intent(DodajPowiadomienieLekFragment.this, MainActivity.class);
         //   pendingIntent = PendingIntent.getBroadcast(DodajPowiadomienieLekFragment.this.getContext(), 0, myIntent, 0);
         //   alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);
        }
    }


}
