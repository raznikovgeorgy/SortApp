package com.syncretis;

import java.util.ArrayList;

public class FastISortable implements ISortable {
    @Override
    public void sort(ArrayList<Integer> array) {
        if (!array.isEmpty()) {
            sortImpl(array, 0, array.size() - 1);
        }
    }

    private void sortImpl(ArrayList<Integer> array, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int pivot = array.get((leftMarker + rightMarker) / 2);
        do {
            while (array.get(leftMarker) < pivot) {
                leftMarker++;
            }
            while (array.get(rightMarker) > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(array, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < right) {
            sortImpl(array, leftMarker, right);
        }
        if (left < rightMarker) {
            sortImpl(array, left, rightMarker);
        }
    }
}
