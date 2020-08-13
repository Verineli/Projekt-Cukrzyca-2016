package com.example.walcius.dzielnypacjent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_settings:
                PokazUstawienia();
                return true;
            case R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void PokazLeki(View view)
    {
        Intent intent = new Intent(this,LekiActivity.class);
        startActivity(intent);
    }


    public void PokazWyniki(View view)
    {
        Intent intent = new Intent(this,WynikiActivity.class);
        startActivity(intent);
    }

    public void PokazUstawienia()
    {
       // Intent intent = new Intent(this,UstawieniaActivity.class);
        Intent intent = new Intent(this,PasswordActivity.class);
        startActivity(intent);
    }

    public void PokazPowiadomienia(View view)
    {
        Intent intent = new Intent(this,PowiadomieniaActivity.class);
        startActivity(intent);
    }
}
