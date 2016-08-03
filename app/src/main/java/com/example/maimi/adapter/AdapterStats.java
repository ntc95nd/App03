package com.example.maimi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maimi.boom1.R;
import com.example.maimi.models.Stats;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhtien on 8/1/2016.
 */
public class AdapterStats extends ArrayAdapter{
    private Context context;
    private ArrayList<Stats> arrText;
    private LayoutInflater layoutInflater;
    public AdapterStats(Context context, int resource, ArrayList objects) {
        super(context, resource, objects);
        arrText = objects;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.item_stats,parent,false);
        TextView txtStats = (TextView) convertView.findViewById(R.id.txt_stats);
        txtStats.setText(arrText.get(position).getStringStats());
        return convertView;

    }
}
