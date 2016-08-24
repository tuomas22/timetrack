package com.example.tuomas.time3;

import java.util.Date;

/**
 * Created by Tuomas on 17.8.2016.
 */
public class Event {

    public String type;
    public Integer durationH;
    public Date date;

    public Event(String mType, Integer mDurationH, Date mDate){

        type = mType;
        durationH = mDurationH;
        date = mDate;
    }
}
