package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ramachari on 11-08-2017.
 */

public class EarthQuakeAdapter extends ArrayAdapter <EarthQuake>{

    public EarthQuakeAdapter(Activity context, ArrayList<EarthQuake> earthQuakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,earthQuakes);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.eathquake_list_item, parent, false);
        }

        EarthQuake currentEarthQuake = getItem(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthQuake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthQuake.getLocation());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthQuake.getDate());

        return listItemView;

    }

}


