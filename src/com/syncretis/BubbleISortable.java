package com.syncretis;

import java.util.ArrayList;

public class BubbleISortable implements ISortable {
    @Override
    public void sort(ArrayList<Integer> array) {
        for (int i = 0; i + 1 < array.size(); ++i) {
            for (int j = 0; j + 1 < array.size() - i; ++j) {
                if (array.get(j) > array.get(j + 1)) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
