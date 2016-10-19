package com.example.android.tourguidebogota;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.marriot_title,R.string.marriot_description));
        content.add(new Content(R.string.medina_title,R.string.medina_description));
        content.add(new Content(R.string.radisson_title,R.string.radisson_description));
        content.add(new Content(R.string.fontana_title,R.string.fontana_description));

        ContentAdapater contentAdapater = new ContentAdapater(getActivity(), content);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(contentAdapater);

        return rootView;
    }

}
