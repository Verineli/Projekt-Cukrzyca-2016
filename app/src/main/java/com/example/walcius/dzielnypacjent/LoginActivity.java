package com.example.walcius.dzielnypacjent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.walcius.dzielnypacjent.Pomocnik.GreetingClient;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
        EditText edLogin, edHaslo;

    public void LogIn(View view) {
        edLogin = (EditText) findViewById(R.id.edLogin);
        edHaslo = (EditText) findViewById(R.id.edHaslo);
        String login = edLogin.getText().toString();
        String haslo = edHaslo.getText().toString();
        if (login.isEmpty()) {
            edLogin.setError("Wprowadź login");
            return;
        } else {
            edLogin.setError(null);
        }
        if (haslo.isEmpty()) {
            edHaslo.setError("Wprowadź hasło");
            return;
        } else {
            edHaslo.setError(null);
        }

        GreetingClient.Loguj(login, haslo);
        android.os.SystemClock.sleep(1000);
        if (GreetingClient.Comunication != null) {
            if (GreetingClient.Comunication.equals("ok")) {
                MainActivity.LOGIN = login;
                if (haslo.equals("admin")) {
                    Intent intent = new Intent(this, PasswordActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            } else if (GreetingClient.Comunication.equals("nieok")) {
                edLogin.setError("Login lub hasło niepoprawne");
                edHaslo.setError("Login lub hasło niepoprawne");
                return;
            } else {
                Toast.makeText(LoginActivity.this, "Błąd połączenia", Toast.LENGTH_SHORT).show();
                edLogin.setError(null);
                edHaslo.setError(null);
            }
        }
        else {
            Toast.makeText(LoginActivity.this, "Błąd połączenia", Toast.LENGTH_SHORT).show();
            edLogin.setError(null);
            edHaslo.setError(null);
        }
    }

}
