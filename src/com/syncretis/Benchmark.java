package com.syncretis;

import com.syncretis.Interfaces.ISortable;
import com.syncretis.Sort.BubbleISortable;
import com.syncretis.Sort.FastISortable;
import com.syncretis.Sort.SelectionISortable;

import java.util.ArrayList;

public class Benchmark {
    public static double benchBubbleSort(ArrayList<Integer> array) {
        long start = System.nanoTime();
        ISortable bubbleSort = new BubbleISortable();
        bubbleSort.sort(array);
        long stop = System.nanoTime();
        return stop - start;
    }

    public static double benchSelectionSort(ArrayList<Integer> array) {
        long start = System.nanoTime();
        ISortable selectionSort = new SelectionISortable();
        selectionSort.sort(array);
        long stop = System.nanoTime();
        return stop - start;
    }

    public static double benchFastSort(ArrayList<Integer> array) {
        long start = System.nanoTime();
        ISortable fastSort = new FastISortable();
        fastSort.sort(array);
        long stop = System.nanoTime();
        return stop - start;
    }
}
