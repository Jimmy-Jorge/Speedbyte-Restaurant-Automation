package com.example.vam1994.speedbytedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * The type Menu adapter.
 */
public class MenuAdapter extends ArrayAdapter<String>{

    /**
     * Instantiates a new Menu adapter.
     *
     * @param context  the context
     * @param resource the resource
     */
    public MenuAdapter(Context context, String[] resource){
        super(context, R.layout.menuadapterrows, resource);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater LI = LayoutInflater.from(getContext());
        View customView = LI.inflate(R.layout.menuadapterrows, parent, false);

        String time = getItem(position);

        RatingBar rb = (RatingBar)customView.findViewById(R.id.setRating);
        TextView tv = (TextView)customView.findViewById(R.id.menuItem);

        rb.setNumStars(3);

        tv.setText(time);

        return customView;

    }
}
