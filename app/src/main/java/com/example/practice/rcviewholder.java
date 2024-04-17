package com.example.practice;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class rcviewholder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView unm;
    TextView uno;

    public rcviewholder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.uimg);
        unm = itemView.findViewById(R.id.unm);
        uno = itemView.findViewById(R.id.uno);
    }
}
