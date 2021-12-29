package com.example.football;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.viewHolder> {

    Context context;
    ArrayList<ItemObjHome> homeArrayList;

    public HomeAdapter(Context context, ArrayList<ItemObjHome> itemObjHomes) {
        this.context = context;
        this.homeArrayList = itemObjHomes;
    }

    @NonNull
    @Override
    public HomeAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_home,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.viewHolder holder, int position) {

        ItemObjHome itemObjHome = homeArrayList.get(position);
        holder.titleLeague.setText(itemObjHome.titleLeague);
        holder.imageLeague.setImageResource(itemObjHome.imageLeague);


    }

    @Override
    public int getItemCount() {
        return homeArrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        TextView titleLeague;
        ShapeableImageView imageLeague;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            titleLeague = itemView.findViewById(R.id.titleLeague);
            imageLeague = itemView.findViewById(R.id.imgLeague);
        }
    }

}
