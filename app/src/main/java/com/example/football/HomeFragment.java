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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.rcvListCalendar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        itemObjHomes = new ArrayList<>();

        ItemObjHome leagueOne = new ItemObjHome(R.drawable.premier_league, "Premier League");
        itemObjHomes.add(leagueOne);

        ItemObjHome leagueTwo = new ItemObjHome(R.drawable.champions_league, "Champions League");
        itemObjHomes.add(leagueTwo);

        ItemObjHome leagueThree = new ItemObjHome(R.drawable.bundes_liga, "Bundes Liga");
        itemObjHomes.add(leagueThree);

        ItemObjHome LeagueFour = new ItemObjHome(R.drawable.la_liga, "La liga");
        itemObjHomes.add(LeagueFour);

        recyclerView.setAdapter(new HomeAdapter(itemObjHomes));

        return view;

    }
}

//Time
//        System.currentTimeMillis();