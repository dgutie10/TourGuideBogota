package com.example.android.tourguidebogota;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by diegog on 10/13/2016.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {super(fm); mContext = context;}


    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new SitesFragment();
        }else if(position == 1){
            return new ActivitiesFragment();
        }else if (position == 2){
            return new HotelsFragment();
        }else {
            return new ReaturantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString((R.string.fragment_sites));
        }else if (position == 1){
            return mContext.getString(R.string.fragmnet_activities);
        }else if (position == 2){
            return mContext.getString(R.string.fragment_hotels);
        }else {
           return mContext.getString(R.string.fragment_restaurants);
        }

    }
}
