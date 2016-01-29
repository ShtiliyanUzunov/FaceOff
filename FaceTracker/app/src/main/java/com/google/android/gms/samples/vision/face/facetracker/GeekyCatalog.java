package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by I314375 on 1/28/2016.
 */
public class GeekyCatalog extends Catalog {

    public GeekyCatalog(float prob) {
        super(prob);
    }

    public String name = "Geeky";

    public String[] titles = {
            "Friend bought $600 Apple Watch off eBay. This is what came.",
            "Yep. Can't be the only one",
            "Math for Grownups",
            "Gamers will understand",
            "Thrift store gold",
            "Good times were had.",
            "BB8 snowman edition",
            "You know the feeling"
    };

    public Integer[] ids = {
            R.drawable.geeky_1,
            R.drawable.geeky_2,
            R.drawable.geeky_3,
            R.drawable.geeky_4,
            R.drawable.geeky_5,
            R.drawable.geeky_6,
            R.drawable.geeky_7,
            R.drawable.geeky_8

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


