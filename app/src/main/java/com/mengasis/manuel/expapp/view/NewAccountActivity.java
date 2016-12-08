package com.mengasis.manuel.expapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mengasis.manuel.expapp.R;

public class NewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        showToolbar(getResources().getString(R.string.titulo_crear_cuenta),true);
    }

    // Recibira un titulo y un boton de regreso
    public void showToolbar(String titulo, Boolean backButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titulo);

        // Activa o desactiva el boton de regreso
        getSupportActionBar().setDisplayHomeAsUpEnabled(backButton);
    }
}
