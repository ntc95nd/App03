package com.example.maimi.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.maimi.adapter.AdapterClasses;
import com.example.maimi.adapter.AdapterStats;
import com.example.maimi.boom1.R;
import com.example.maimi.models.Classes;
import com.example.maimi.models.Stats;

import java.util.ArrayList;

/**
 * Created by minhtien on 8/1/2016.
 */
public class ClassesFragment extends Fragment {
    private ListView lvClasses;
    private AdapterClasses adapterClasses;
    private ArrayList<Classes> arrClases;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_classes, container, false);
        lvClasses = (ListView) view.findViewById(R.id.lv_classes);
        arrClases = new ArrayList<>();
        arrClases.add(new Classes("Tank", "Level 0", "A basic design in which it has all around average stats and nothing special. You spawn as this when initially starting.",
                R.drawable.tank_machinegun
        ));

        adapterClasses = new AdapterClasses(getActivity(), R.layout.item_classes, arrClases);
        lvClasses.setAdapter(adapterClasses);
        return view;
    }
}
