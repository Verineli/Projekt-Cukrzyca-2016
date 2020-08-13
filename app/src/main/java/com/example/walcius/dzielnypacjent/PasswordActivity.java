package com.example.walcius.dzielnypacjent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.walcius.dzielnypacjent.Pomocnik.GreetingClient;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
    }
    EditText edStare;
    EditText edNowe;
    EditText edNowePow;

    public void Zapisz(View view){

        edStare = (EditText)findViewById(R.id.edStareHaslo);
        String stare = edStare.getText().toString();

        edNowe = (EditText)findViewById(R.id.edNoweHasloPow);
        String nowe = edNowe.getText().toString();

        edNowePow = (EditText)findViewById(R.id.edNoweHaslo);
        String nowePow = edNowePow.getText().toString();

        if(stare.isEmpty()){
            edStare.setError("Wpisz stare hasło");
        }
        if(nowe.isEmpty()){
            edNowe.setError("Wpisz nowe hasło");
        }
        if(nowePow.isEmpty()){
            edNowePow.setError("Wpisz ponownie hasło");
        }
//        if ( stare.equals("")||nowe.equals("")||nowePow.equals(""))
//        {
//            Toast.makeText(this,"Wypełnij wszystkie pola",Toast.LENGTH_SHORT).show();
//        }
        else {
            if (nowe.equals(nowePow)){
                GreetingClient.ZmienHaslo(MainActivity.LOGIN,stare,nowe);
                android.os.SystemClock.sleep(1000);
                if(GreetingClient.Comunication.equals("ok")){
                    Toast.makeText(PasswordActivity.this,"Hasło zmienione",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(PasswordActivity.this,"Wystąpił błąd",Toast.LENGTH_SHORT).show();
                }
            }
            else {
                edNowe.setError("Podane hasła się nie zgadzają");
                edNowePow.setError("Podane hasła się nie zgadzają");
            }
            }
        }
    }

