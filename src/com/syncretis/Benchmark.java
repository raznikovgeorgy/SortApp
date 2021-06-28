package com.syncretis;

import java.util.ArrayList;

public class Benchmark {
    public static double benchBubbleSort(ArrayList<Integer> array) {
        long start = System.nanoTime();
        Sortable bubbleSort = new BubbleSortable();
        bubbleSort.sort(array);
        long stop = System.nanoTime();
        return stop - start;
    }
    public static double benchSelectionSort(ArrayList<Integer> array) {
        long start = System.nanoTime();
        Sortable selectionSort = new SelectionSortable();
        selectionSort.sort(array);
        long stop = System.nanoTime();
        return stop - start;
    }
    public static double benchFastSort(ArrayList<Integer> array) {
        long start = System.nanoTime();
        Sortable fastSort = new FastSortable();
        fastSort.sort(array);
        long stop = System.nanoTime();
        return stop - start;
    }
}
