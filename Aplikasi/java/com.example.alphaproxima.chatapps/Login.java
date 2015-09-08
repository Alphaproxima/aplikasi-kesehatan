package com.example.alphaproxima.chatapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText textUsername, setPassword;
    TextView  textForgot, textRegister;
    Button setLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textUsername = (EditText) findViewById(R.id.textUsername);
        setPassword = (EditText) findViewById(R.id.setPassword);
        textForgot = (TextView) findViewById(R.id.textForgot);
        textRegister = (TextView) findViewById(R.id.textRegister);

        setLogin = (Button) findViewById(R.id.setButton);
        setLogin.setOnClickListener(this);
        textForgot.setOnClickListener(this);
        textRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setLogin:
                break;

            case R.id.setRegister:
                startActivity(new Intent(this, register.class));
                break;

            case R.id.textForgot:
                startActivity(new Intent(this, Forgot.class));
                break;
        }
    }
}
