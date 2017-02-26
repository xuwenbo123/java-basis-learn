package com.webb.basis.algorithm;

/**
 * 冒泡排序
 **/
public class BubbleSorter extends Sorter {

    @Override
    public void sort(int[] array) {
        int tmp;

        for (int i = 0; i < array.length - 1; i++) { // 做n - 1次排序
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}