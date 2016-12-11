package com.mengasis.manuel.expapp.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mengasis.manuel.expapp.R;
import com.mengasis.manuel.expapp.adapter.PictureAdapterRecyclerView;
import com.mengasis.manuel.expapp.model.Picture;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        showToolbar("Home", false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        //Es para que el scroll sea vertical
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<Picture>();
        pictures.add(new Picture("Bruce Wayne", "http://www.novalandtours.com/images/guide/guilin.jpg", "100 dias", "100"));
        pictures.add(new Picture("Dick Grayson", "http://www.novalandtours.com/images/guide/guilin.jpg", "60 dias", "80"));
        pictures.add(new Picture("Jason Todd", "http://www.novalandtours.com/images/guide/guilin.jpg", "55 dias", "75"));
        pictures.add(new Picture("Tim Drake", "http://www.novalandtours.com/images/guide/guilin.jpg", "40 dias", "70"));
        pictures.add(new Picture("Damian Wayne", "http://www.novalandtours.com/images/guide/guilin.jpg", "10 dias", "40"));

        return pictures;
    }

    // Recibira un titulo y un boton de regreso
    public void showToolbar(String titulo, Boolean upButton ,View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);

        //Se obtiene el activity en el que esta contenido el fragment y se castea para que sea AppCompactActivity
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);

        // Activa o desactiva el boton de regreso
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
