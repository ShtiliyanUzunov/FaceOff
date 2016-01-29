package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by I314375 on 1/28/2016.
 */
public class AnimalsCatalog extends Catalog {

    public AnimalsCatalog(float prob) {
        super(prob);
    }

    public String name = "Animals";

    public String[] titles = {
            "I'm not a cat person but wow this little guy is adorable",
            "Why are we not obsessed with tree kangaroos? They're cute as f**k!",
            "Handsome bird looking at a handsome bird.",
            "My dog like to gossip over the garden wall",
            "That's one happy pig :]",
            "Hoooman",
            "This dog likes to dig holes and then just sits and chills in them watching people...",
            "Wait, what?",
            "Kung Fu cat!"
    };

    public Integer[] ids = {
            R.drawable.anim_1,
            R.drawable.anim_2,
            R.drawable.anim_3,
            R.drawable.anim_4,
            R.drawable.anim_5,
            R.drawable.anim_6,
            R.drawable.anim_7,
            R.drawable.anim_8,
            R.drawable.anim_9
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
