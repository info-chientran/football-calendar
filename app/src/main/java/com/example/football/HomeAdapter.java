package com.example.football;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.viewHolder> {

    ArrayList<ItemObjHome> itemObjHomes;

    public HomeAdapter(ArrayList<ItemObjHome> homeArrayList) {
        this.itemObjHomes = homeArrayList;
    }

    @NonNull
    @Override
    public HomeAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.viewHolder holder, int position) {
        holder.imageLeague.setImageResource(itemObjHomes.get(position).getImageLeague());
        holder.titleLeague.setText(itemObjHomes.get(position).getTitleLeague());
    }

    @Override
    public int getItemCount() {
        return itemObjHomes.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageLeague;
        TextView titleLeague;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageLeague = itemView.findViewById(R.id.imgLeague);
            titleLeague = itemView.findViewById(R.id.titleLeague);
        }
    }

}
