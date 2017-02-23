package com.webb.basis.algorithm;

public class Main {

    public static void main(String[] args) {
        Sorter sorter = new StraightInsertionSorter();

        int[] array = new int[] { 2, 3, 1, 4, 6, 5, 7, 8, 9 };

        sorter.sort(array);
    }

}
