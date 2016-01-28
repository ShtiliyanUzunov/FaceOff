package com.google.android.gms.samples.vision.face.facetracker;

import android.graphics.Color;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.FillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by I314375 on 1/27/2016.
 */
public class EmotionGraph {

    private LineChart chart;
    private long start;
    private HashMap<Integer, Float> data;

    int count = 20;

    EmotionGraph (LineChart chart) {
        this.chart = chart;
        data = new HashMap<Integer, Float>();
        start = System.currentTimeMillis();
        chart.setBackgroundColor(Color.WHITE);
        addPoint(0);
    }

    public void addPoint(float val) {
        data.put((int) (System.currentTimeMillis() - start), val);
    }

    public void invalidateChart() {
        updateData();
        chart.invalidate();
    }

    public int getDataSize() {
        return data.size();
    }

    public float getAverage() {
        float total = 0;
        for (float record: data.values()) {
            total += record;
        }
        return total/data.size();
    }

    private void updateData() {
        synchronized (data)  {
            ArrayList<String> xVals = new ArrayList<String>();
            ArrayList<Entry> vals = new ArrayList<Entry>();

            Integer[] keys = data.keySet().toArray(new Integer[data.keySet().size()]);
            Arrays.sort(keys);

            int count = 0;
            for (int key: keys) {
                xVals.add("" + key);
                vals.add(new Entry(data.get(key), count++));
            }

            LineDataSet set = new LineDataSet(vals, "");

            set.setDrawCubic(true);
            set.setCubicIntensity(0.2f);
            set.setDrawFilled(true);
            set.setDrawCircles(false);
            set.setDrawValues(false);
            set.setLineWidth(1.8f);
            set.setCircleRadius(4f);
            set.setCircleColor(Color.RED);
            set.setHighLightColor(Color.rgb(244, 117, 117));
            set.setColor(Color.RED);
            set.setFillColor(Color.RED);
            set.setFillAlpha(50);
            set.setDrawHorizontalHighlightIndicator(false);
            set.setFillFormatter(new FillFormatter() {
                @Override
                public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
                    return -10;
                }
            });

            LineData data = new LineData(xVals, set);
            chart.setData(data);
        }

    }

}
