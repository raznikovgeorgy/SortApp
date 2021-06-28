package com.syncretis;

import java.util.ArrayList;

class BinarySearch {
    public int search(ArrayList<Integer> array, int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        count += 1;
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (array.get(mid) == elementToSearch)
                return mid;

            if (array.get(mid) > elementToSearch)
                return search(array, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return search(array, mid + 1, lastElement, elementToSearch);
        }
        return -1;
    }

    public int search(ArrayList<Integer> array, int elementToSearch) {
        count = 0;
        return search(array, 0, array.size(), elementToSearch);

    }

    public int count = 0;
}