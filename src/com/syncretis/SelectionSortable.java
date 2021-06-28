package com.syncretis;

import java.util.ArrayList;

public class SelectionSortable implements Sortable {
    @Override
    public void sort(ArrayList<Integer> array) {
        if (!array.isEmpty()) {
            sortImpl(array, 0);
        }
    }

    private void sortImpl(ArrayList<Integer> array, int left) {
        for (int i = 0; i < array.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(min)) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }
}
