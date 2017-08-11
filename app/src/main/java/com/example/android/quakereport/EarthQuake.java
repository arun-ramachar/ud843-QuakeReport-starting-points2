package com.example.android.quakereport;

/**
 * Created by Ramachari on 11-08-2017.
 */

public class EarthQuake {
    //magnitude of the earth quake
    private String mMagnitude;

    //location of the earth quake//
    private String mLocation;

    //date of the earthquake//
    private String mDate;


    public EarthQuake(String magnitude,String location,String date){
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
    }

    public String getMagnitude(){
        return mMagnitude;

    }
    public String getLocation(){
        return mLocation;

    }
    public String getDate(){
        return mDate;

    }
}



