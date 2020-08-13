package com.example.walcius.dzielnypacjent;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class LekiActivity extends BaseActivity {

    String[] s = {"a","b","c"};
    ArrayAdapter<String> adapter;
    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leki);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        gv = (GridView)findViewById(R.id.gvLeki);
        gv.setAdapter(adapter);
    }
}
