package com.example.maimi.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.maimi.adapter.AdapterStats;
import com.example.maimi.boom1.R;
import com.example.maimi.models.Stats;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhtien on 8/1/2016.
 */
public class StatsFragment extends Fragment {
    private ListView lvStats;
    private AdapterStats adapterStats;
    private ArrayList<Stats> arrText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stats,container,false);
        lvStats = (ListView) view.findViewById(R.id.lv_stats);
        arrText = new ArrayList<>();
        arrText.add(new Stats("Health Regen – After a short amount of time without taking damage, you will start regaining health. Upgrading this will increase the effect."));
        arrText.add(new Stats("Max Health – Your maximum health. Upgrade this to be able to take more bullets before dying."));
        adapterStats = new AdapterStats(getActivity(),R.layout.item_stats,arrText);
        lvStats.setAdapter(adapterStats);
        return view;
    }
}
