package com.google.android.gms.samples.vision.face.facetracker;

import com.google.android.gms.samples.vision.face.facetracker.R;

/**
 * Created by I314375 on 1/28/2016.
 */
public class StarWarsCatalog extends Catalog {

    public StarWarsCatalog(float prob) {
        super(prob);
    }

    public String name = "StarWars";

    public String[] titles = {
            "Kylo Ren chopsticks ! Now I can eat sushis while telling my mom it's not a phase.",
            "You're not you when you're hungry.(Found on 9gag)",
            "The Force is strong with this corn",
            "Which is your favourite ren?",
            "Be loyal. Be smart. Be tr8r.",
            "Found this chilling pic of yoda. Is it worth to share?",
            "I don't know you guys, but I find this pretty adorable.",
            "Mom, can I buy a Poster?",
            "One of my few posters!",
            "I have some poster too"
    };

    public Integer[] ids = {
            R.drawable.sw_1,
            R.drawable.sw_2,
            R.drawable.sw_3,
            R.drawable.sw_4,
            R.drawable.sw_5,
            R.drawable.sw_6,
            R.drawable.sw_7,
            R.drawable.sw_8,
            R.drawable.sw_9,
            R.drawable.sw_10
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
