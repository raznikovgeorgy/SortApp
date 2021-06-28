package com.syncretis;

import java.util.ArrayList;

public interface Sortable {
    void sort(ArrayList<Integer> array);
    default void swap(ArrayList<Integer> array, int a, int b){
        int temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }
}
