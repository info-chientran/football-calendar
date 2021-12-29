package com.example.football;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ItemObjHome> itemObjHomes;
    HomeAdapter homeAdapter;
    String[] titleLeague;
    int[] imageLeagueId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recyclerView = recyclerView.findViewById(R.id.rcvListCalendar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        //Time today
//        System.currentTimeMillis();
        return view;
    }

}