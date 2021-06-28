package com.syncretis;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int power = 2;
        BinarySearchTest binTest = new BinarySearchTest();

        for (int i = 10; i <= Math.pow(10, power); i *= 10) {
            ArrayList<Integer> array = new ArrayList<Integer>(i);
            for (int j = 0; j < i; ++j) {
                array.add(i - j - 1);
            }
            ArrayList<Integer> array2 = new ArrayList<Integer>(array);
            ArrayList<Integer> array3 = new ArrayList<Integer>(array);
            System.out.println("ArraySize is: " + array.size());
            System.out.println("BubbleSort time is: " + Benchmark.benchBubbleSort(array) + "(ns)");
            System.out.println("BinarySearch time is: " + binTest.benchBinary(array, 1) + "(ns) avgerage tries count: " + binTest.getAvgTries());
            System.out.println("SelectionSort time is: " + Benchmark.benchSelectionSort(array2) + "(ns)");
            System.out.println("FastSort time is: " + Benchmark.benchFastSort(array3) + "(ns)");
            System.out.println("Bubble Sorted array: " + Arrays.toString(array.toArray()));
            System.out.println("Selection Sorted array: " + Arrays.toString(array2.toArray()));
            System.out.println("Fast Sorted array: " + Arrays.toString(array3.toArray()));

            System.out.println("**********");

        }
    }
}
