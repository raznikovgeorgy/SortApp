package com.syncretis.Search;

import com.syncretis.Interfaces.ISearchable;

import java.util.ArrayList;

class BinarySearch implements ISearchable {
    public int search(ArrayList<Integer> array, int firstElement, int lastElement, int searchedElement) {

        // условие прекращения
        count += 1;
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (array.get(mid) == searchedElement)
                return mid;

            if (array.get(mid) > searchedElement)
                return search(array, firstElement, mid - 1, searchedElement);

            // также, вызываем метод рекурсивно по суженным данным
            return search(array, mid + 1, lastElement, searchedElement);
        }
        return -1;
    }

    public int search(ArrayList<Integer> array, int searchedElement) {
        count = 0;
        return search(array, 0, array.size(), searchedElement);

    }

    public int count = 0;
}