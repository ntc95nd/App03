package com.example.maimi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maimi.boom1.R;
import com.example.maimi.models.Classes;
import com.example.maimi.models.Stats;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minhtien on 8/1/2016.
 */
public class AdapterClasses extends ArrayAdapter {
    private ArrayList<Classes> arrText;
    private LayoutInflater layoutInflater;

    public AdapterClasses(Context context, int resource, ArrayList objects) {
        super(context, resource, objects);
        arrText = objects;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.item_classes,parent,false);
        TextView txtName  = (TextView) convertView.findViewById(R.id.txt_name);
        TextView txtDes = (TextView) convertView.findViewById(R.id.txt_des);
        TextView txtLevel = (TextView) convertView.findViewById(R.id.txt_level);
        txtName.setText(arrText.get(position).getTxtName());
        txtDes.setText(arrText.get(position).getTxtDes());
        txtLevel.setText(arrText.get(position).getTxtLevel());
        return convertView;
    }
}
