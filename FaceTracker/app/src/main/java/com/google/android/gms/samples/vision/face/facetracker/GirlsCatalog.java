package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by I314375 on 1/28/2016.
 */
public class GirlsCatalog extends Catalog {

    public GirlsCatalog(float prob) {
        super(prob);
    }

    public String name = "Girls";

    public String[] titles = {
            "Rachel Cook is a damn cute person",
            "Emma Watson new profile photo blown up the internet.",
            "Jenna Coleman, everyone.",
            "Miranda Kerr",
            "Kaley Cuoco",
            "McKayla Maroney",
            "All hail the queen",
            "Taylor Swift",
            "There's always exceptions",
            "Shailene Woodley"
    };

    public Integer[] ids = {
            R.drawable.girl_1,
            R.drawable.girl_2,
            R.drawable.girl_3,
            R.drawable.girl_4,
            R.drawable.girl_5,
            R.drawable.girl_6,
            R.drawable.girl_7,
            R.drawable.girl_8,
            R.drawable.girl_9,
            R.drawable.girl_10,
    };

    @Override
    protected String[] getTitles() {
        return titles;
    }

    @Override
    protected Integer[] getIds() {
        return ids;
    }

    @Override
    public String getName() { return name; }

}
