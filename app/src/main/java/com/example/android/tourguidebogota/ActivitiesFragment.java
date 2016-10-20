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
public class ActivitiesFragment extends Fragment {


    public ActivitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView  = inflater.inflate(R.layout.category_list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
//        content.add(new Content(R.string.ciclovia_title,R.string.ciclovia_desciption));
//        content.add(new Content(R.string.humedales_title,R.string.humedales_description));
//        content.add(new Content(R.string.hacienda_title,R.string.hacienda_description));
//        content.add(new Content(R.string.centro_title,R.string.centro_description));
//        content.add(new Content(R.string.art_title,R.string.art_description));
////        content.add(new Content(R.string.,R.string.,R.drawable.));


        content.add(new Content(R.string.ciclovia_title,R.string.ciclovia_desciption, R.drawable.activities_ciclovia));
        content.add(new Content(R.string.humedales_title,R.string.humedales_description,R.drawable.humedales_activity));
        content.add(new Content(R.string.hacienda_title,R.string.hacienda_description,R.drawable.hacienda_activity));
        content.add(new Content(R.string.centro_title,R.string.centro_description,R.drawable.andino_activity));
        content.add(new Content(R.string.art_title,R.string.art_description,R.drawable.art_activity));

        ContentAdapater contentAdapater = new ContentAdapater(getActivity(),content);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(contentAdapater);



        return rootView;
    }

}
