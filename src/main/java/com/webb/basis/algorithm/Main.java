package com.webb.basis.algorithm;

public class Main {

    public static void main(String[] args) {
//        Sorter sorter = new StraightInsertionSorter();
//        Sorter sorter = new StraightSelectionSorter();
//        Sorter sorter = new BubbleSorter();
//        Sorter sorter = new ShellSorter();
        Sorter sorter = new QuickSort();
//        Sorter sorter = new MergeSorter();

        int[] array = new int[] { 2, 3, 1, 4, 6, 5, 7, 8, 9 };

        sorter.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}
