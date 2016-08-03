package com.example.maimi.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.maimi.adapter.AdapterStats;
import com.example.maimi.boom1.R;
import com.example.maimi.models.ScorePoints;
import com.example.maimi.models.Stats;

import java.util.ArrayList;

/**
 * Created by minhtien on 8/3/2016.
 */
public class ScorePointFragment extends Fragment {
    private ListView lvStats;
    private AdapterStats adapterStats;
    private ArrayList<ScorePoints> arrText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_score_points, container, false);
        lvStats = (ListView) view.findViewById(R.id.lv_score_point);
        arrText = new ArrayList<>();
        arrText.add(new ScorePoints(R.drawable.score_1,"Square: 10 points"));
        adapterStats = new AdapterStats(getActivity(), R.layout.item_stats, arrText);
        lvStats.setAdapter(adapterStats);
        return view;
    }
}
