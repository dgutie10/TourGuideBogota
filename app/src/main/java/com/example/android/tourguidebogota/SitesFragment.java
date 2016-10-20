package com.example.android.tourguidebogota;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SitesFragment extends Fragment {


    public SitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.category_list,container,false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.candelaria_title,R.string.candelaria_description));
        content.add(new Content(R.string.zonarosa_title,R.string.zonarosa_description));
        content.add(new Content(R.string.zonag_title,R.string.zonag_description));
        content.add(new Content(R.string.park93_title,R.string.park93_description));
        content.add(new Content(R.string.usaquen_title,R.string.usaquen_description));
        content.add(new Content(R.string.monserrate_title,R.string.monserrate_description));

        ContentAdapater contentAdapater = new ContentAdapater(getActivity(),content);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(contentAdapater);

        return rootView;
    }

}
