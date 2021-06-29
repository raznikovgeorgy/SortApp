package com.syncretis;

import com.syncretis.Search.BinarySearchTest;
import com.syncretis.Sort.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to my amazing SortApp!");
        System.out.println("**********");

        int power = 2;
        BinarySearchTest binTest = new BinarySearchTest();
        LinearSearch linearSearch = new LinearSearch();

        for (int i = 10; i <= Math.pow(10, power); i *= 10) {
            ArrayList<Integer> array = new ArrayList<>(i);
            for (int j = 0; j < i; ++j) {
                array.add(i - j - 1);
            }
            ArrayList<Integer> array2 = new ArrayList<>(array);
            ArrayList<Integer> array3 = new ArrayList<>(array);
            System.out.println("Array size is: " + array.size());
            System.out.println("Bubble sort time is: " + Benchmark.benchBubbleSort(array) + "(ns)");
            System.out.println("Binary search time is: " + binTest.benchBinary(array, 1) + "(ns) average tries count: " + binTest.getAvgTries());
            System.out.println("Selection sort time is: " + Benchmark.benchSelectionSort(array2) + "(ns)");
            System.out.println("FastSort time is: " + Benchmark.benchFastSort(array3) + "(ns)");
            System.out.println("Bubble sorted array: " + Arrays.toString(array.toArray()));
            System.out.println("Selection Sorted array: " + Arrays.toString(array2.toArray()));
            System.out.println("Searching for 15 in array2, the index of searched element is: " + linearSearch.search(array2, 15));
            System.out.println("Fast sorted array: " + Arrays.toString(array3.toArray()));
            System.out.println("**********");

        }
    }
}
