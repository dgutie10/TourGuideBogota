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
public class ReaturantsFragment extends Fragment {


    public ReaturantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView  = inflater.inflate(R.layout.category_list,container,false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.black_bear_title, R.string.black_bear_description));
        content.add(new Content(R.string.cielo_title,R.string.cielo_description));
        content.add(new Content(R.string.bruto_title,R.string.bruto_description));
        content.add(new Content(R.string.matiz_title,R.string.matiz_description));
        content.add(new Content(R.string.criterion_title,R.string.criterion_description));
        content.add(new Content(R.string.nn_title,R.string.nn_description));
        content.add(new Content(R.string.casa_title,R.string.casa_desctiption));
        content.add(new Content(R.string.wok_title,R.string.wok_description));
        content.add(new Content(R.string.juan_title,R.string.juan_description));
        content.add(new Content(R.string.side_title,R.string.side_note));

        ContentAdapater contentAdapater = new ContentAdapater(getActivity(),content);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(contentAdapater);


        return rootView;
    }

}
