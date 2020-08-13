package com.example.walcius.dzielnypacjent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WynikiActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyniki);
    }

    public void DodajPomiar(View view){
        Intent i = new Intent(this,WynikiDodajActivity.class);
        startActivity(i);
    }

}
