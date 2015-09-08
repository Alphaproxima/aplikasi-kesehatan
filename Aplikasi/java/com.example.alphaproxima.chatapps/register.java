package com.example.alphaproxima.chatapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener{

    EditText textNama, textUmur, textUsername, textPekerjaan, textEmail, textPassword;
    Button setRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textNama = (EditText) findViewById(R.id.textNama);
        textUmur = (EditText) findViewById(R.id.textUmur);
        textPekerjaan = (EditText) findViewById(R.id.textPekerjaan);
        textEmail = (EditText) findViewById(R.id.textEmail);
        textUsername = (EditText) findViewById(R.id.textUsername);
        textPassword = (EditText) findViewById(R.id.textPassword);

        setRegister = (Button) findViewById(R.id.setRegister);
        setRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setRegister:


                break;
        }
    }
}
