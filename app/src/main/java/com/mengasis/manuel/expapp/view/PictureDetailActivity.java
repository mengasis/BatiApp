package com.mengasis.manuel.expapp.view;

import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;
import android.view.View;

import com.mengasis.manuel.expapp.R;

public class PictureDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_detail);
        showToolbar("", true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Fade());
        }
    }

    // Recibira un titulo y un boton de regreso
    public void showToolbar(String titulo, Boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Se obtiene el activity en el que esta contenido el fragment y se castea para que sea AppCompactActivity
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titulo);

        // Activa o desactiva el boton de regreso
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
    }
}
