package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<rcviewholder> {
    Context context;
    ArrayList<P_model> itemlist;

    public Adapter(Context context, ArrayList<P_model> itemlist) {
        this.context = context;
        this.itemlist = itemlist;
    }

    @NonNull
    @Override
    public rcviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new rcviewholder(LayoutInflater.from(context).inflate(R.layout.p_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull rcviewholder holder, int position) {
        holder.unm.setText(itemlist.get(position).getName());
        holder.uno.setText(itemlist.get(position).getNo());
        holder.img.setImageResource(itemlist.get(position).getImg());
    }

    @Override
    public int getItemCount() {return itemlist.size();}
}
