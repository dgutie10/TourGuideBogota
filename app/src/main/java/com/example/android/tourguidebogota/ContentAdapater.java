package com.example.android.tourguidebogota;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diegog on 10/17/2016.
 */

public class ContentAdapater extends ArrayAdapter<Content> {

    public ContentAdapater (Activity context, ArrayList<Content> content){
        super(context,0, content);
    }


    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        Content currentContent = getItem(position);

        View listItemView = contentView;

        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView titleText = (TextView) listItemView.findViewById(R.id.section_title);
        titleText.setText(currentContent.getmSectionTitle());

        TextView sectionText = (TextView) listItemView.findViewById(R.id.section_description);
        sectionText.setText(currentContent.getmSectionDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.section_image);

        if (currentContent.hasImage()) {
            imageView.setImageResource(currentContent.getmSectionImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
