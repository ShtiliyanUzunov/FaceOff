package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by I314375 on 1/28/2016.
 */
public class CatalogManager {

    public Catalog[] catalogs;
    private int currentCatalog;
    private float p = 0.2f;

    public CatalogManager() {
        catalogs = new Catalog[] {
                    new AnimalsCatalog(0.25f),
                    new GeekyCatalog(0.25f),
                    new GirlsCatalog(0.25f),
                    new StarWarsCatalog(0.25f)
        };
    }

    public Object[] getContent() {
        int index = 0;
        double roll = Math.random();
        float[] intervals = {
            0,
            catalogs[0].probability,
            catalogs[0].probability + catalogs[1].probability,
            catalogs[0].probability + catalogs[1].probability + catalogs[2].probability,
            1
        };

        for (int i = 0; i < intervals.length - 1; i++) {
            if (roll > intervals[i] && roll <= intervals[i+1]) {
                index = i;
                break;
            }
        }

        currentCatalog = index;
        return catalogs[index].getNextItem();
    }

    public String getCatalogTitle() {
        return catalogs[currentCatalog].getName();
    }


    public void updateDislike() {
        float changeCurrent = p * catalogs[currentCatalog].probability;
        float changeOthers = changeCurrent/3.0f;
        for (int i = 0; i < catalogs.length; i++) {
            if (i == currentCatalog) {
                catalogs[i].probability -= changeCurrent;
            } else {
                catalogs[i].probability += changeOthers;
            }
        }
    }

    public void updateLike() {
        float changeCurrent = 0;
        for (int i = 0; i < catalogs.length; i++) {
            if (i == currentCatalog) {
                continue;
            }
            changeCurrent += catalogs[i].probability;
            catalogs[i].probability = (1 - p) * catalogs[i].probability;
        }
        catalogs[currentCatalog].probability += p * changeCurrent;
    }

    private void updateProbabilities(float p) {
        float changeCurrent = p * catalogs[currentCatalog].probability;
        float changeOthers = changeCurrent/3.0f;
        for (int i = 0; i < catalogs.length; i++) {
            if (i == currentCatalog) {
                catalogs[i].probability += changeCurrent;
            } else {
                catalogs[i].probability -= changeOthers;
            }
        }
    }

}
