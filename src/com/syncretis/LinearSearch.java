package com.syncretis;

import java.util.ArrayList;

public class LinearSearch implements ISearchable {
    public int search(ArrayList<Integer> array, int searchedElement) {
        for (int i = 0; i < array.size(); ++i) {
            if (array.get(i) == searchedElement) {
                return i;
            }
        }
        return -1;
    }
}