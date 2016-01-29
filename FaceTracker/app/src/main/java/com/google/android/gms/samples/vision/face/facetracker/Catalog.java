package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by I314375 on 1/28/2016.
 */
public class Catalog {

    private int currentIndex;
    public float probability;

    public Catalog(float prob) {
        currentIndex = 0;
        probability = prob;
    }

    public Object[] getNextItem () {
        Object[] data = new Object[2];
        //Title
        data[0] = getTitles()[currentIndex];
        data[1] = getIds()[currentIndex];
        currentIndex++;
        if (currentIndex >= getTitles().length || currentIndex >= getIds().length) {
            currentIndex = 0;
        }
        return data;
    };

    protected String[] getTitles() {return null;}
    protected Integer[] getIds() {return null;}
    public String getName() { return null; }

}
