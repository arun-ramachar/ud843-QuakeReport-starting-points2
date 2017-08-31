package com.example.android.quakereport;



import static com.example.android.quakereport.R.id.date;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.graphics.drawable.GradientDrawable;
import java.text.DecimalFormat;
/**
 * Created by Ramachari on 11-08-2017.
 */

public class EarthQuake {
    //magnitude of the earth quake
    private double mMagnitude;

    //location of the earth quake//
    private String mLocation;

    private String mUrl;
    private long mTimeInMilliseconds;

    public EarthQuake(double magnitude, String location, long timeInMilliseconds,String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mUrl=url;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;

    }

    public String getLocation() {
        return mLocation;

    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;

    }
    public String getUrl() {
        return mUrl;

    }

}



