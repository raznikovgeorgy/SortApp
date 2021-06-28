package com.syncretis;

import java.util.ArrayList;

class BinarySearchTest {
    private double avgTries;
    private int triesCount = 0;

    public double benchBinary(ArrayList<Integer> array, int count) {
        double time = 0;
        triesCount = 0;
        for (int i = 0; i < count; ++i) {
            int target = (int) (Math.random() * array.size());
            time += timeBinary(array, target);
        }
        avgTries = (double) triesCount / count;
        return time / count;
    }

    public double getAvgTries() {
        return avgTries;
    }

    private double timeBinary(ArrayList<Integer> array, int target) {
        BinarySearch bSearch = new BinarySearch();
        long start = System.nanoTime();
        bSearch.search(array, target);
        long stop = System.nanoTime();
        triesCount += bSearch.count;
        return stop - start;
    }
}