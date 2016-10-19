package com.example.android.tourguidebogota;

/**
 * Created by diegog on 10/17/2016.
 */

public class Content {

    private int mSectionTitle;
    private int mSectionDescription;
    private int mSectionImage= NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Content (int sectionTitle, int sectionDescription){
        mSectionDescription = sectionDescription;
        mSectionTitle = sectionTitle;
    }

    public Content (int sectionTitle, int sectionDescription, int sectionImage){
        mSectionDescription = sectionDescription;
        mSectionTitle = sectionTitle;
        mSectionImage = sectionImage;
    }

    public int getmSectionTitle() {
        return mSectionTitle;
    }

    public int getmSectionDescription() {
        return mSectionDescription;
    }

    public int getmSectionImage() {
        return mSectionImage;
    }

    public boolean hasImage(){ return mSectionImage != NO_IMAGE; }
}
