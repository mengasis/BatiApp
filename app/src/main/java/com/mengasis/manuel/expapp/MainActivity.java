package com.mengasis.manuel.expapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mengasis.manuel.expapp.view.ContainerActivity;
import com.mengasis.manuel.expapp.view.NewAccountActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    public void crearCuenta(View view){
        // INTENT EXPLICITO
        //Se le da el contexto de la actividad y a donde se quiere ir.
        Intent intent = new Intent(this, NewAccountActivity.class);
        startActivity(intent);
    }
}
