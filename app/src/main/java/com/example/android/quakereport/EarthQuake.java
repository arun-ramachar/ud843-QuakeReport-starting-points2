package com.example.android.quakereport;

import java.text.SimpleDateFormat;

import static com.example.android.quakereport.R.id.date;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Ramachari on 11-08-2017.
 */

public class EarthQuake {
    //magnitude of the earth quake
    private String mMagnitude;

    //location of the earth quake//
    private String mLocation;


    private long mTimeInMilliseconds;

    public EarthQuake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;

    }

    public String getLocation() {
        return mLocation;

    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;

    }
}



