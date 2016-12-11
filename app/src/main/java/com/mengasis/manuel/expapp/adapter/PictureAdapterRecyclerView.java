package com.mengasis.manuel.expapp.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mengasis.manuel.expapp.R;
import com.mengasis.manuel.expapp.model.Picture;

import java.util.ArrayList;

/**
 * Created by manuel on 11-12-16.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resource; // Deberia ser el cardview
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    // Inicializa la clase
    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // El layout se infla para poder trabajarlo
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);

        return new PictureViewHolder(view);
    }

    //Trabajara el ArrayList entrante. Ocupa directamente los atributos del PictureViewHolder
    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.usernameCard.setText(picture.getUsername());
        holder.timeCard.setText(picture.getTime());
        holder.linkeNumberCard.setText(picture.getLike());


    }

    //Entrega la dimension del ArrayList
    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder {

        //private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView linkeNumberCard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            //pictureCard = (ImageView) itemView.findViewById(R.id.image_card);
            usernameCard = (TextView) itemView.findViewById(R.id.username_card);
            timeCard = (TextView) itemView.findViewById(R.id.time_card);
            linkeNumberCard = (TextView) itemView.findViewById(R.id.like_number_card);
        }
    }
}
