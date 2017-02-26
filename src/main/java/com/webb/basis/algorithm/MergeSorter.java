package com.webb.basis.algorithm;

public class MergeSorter extends Sorter {
    @Override
    public void sort(int[] array) {
        int[] auxArray = new int[array.length];
        mergeSort(array, auxArray, 0, array.length - 1);
    }

    /**
     * 基于分治思想，执行归并排序
     */
    private void mergeSort(int[] array, int[] auxArray, int low, int high) {
        int dividedIndex = 0;
        if (low < high) {
            dividedIndex = (low + high) / 2;
            mergeSort(array, auxArray, low, dividedIndex);
            mergeSort(array, auxArray, dividedIndex + 1, high);
            merge(array, auxArray, low, dividedIndex, high);
        }
    }

    private void merge(int[] array, int[] auxArray, int low, int dividedIndex, int high) {
        int i = low; // 指向左半分区数组的指针
        int j = dividedIndex + 1; // 指向右半分区的指针
        int auxPtr = 0; // 指向辅助区数组的指针

        while (i <= dividedIndex && j <= high) { // 将两个有序的数组合并，排序到辅助数组auxArray中
            if (array[i] > array[j]) {
                auxArray[auxPtr++] = array[j++];
            } else {
                auxArray[auxPtr++] = array[i++];
            }
        }

        while (i <= dividedIndex) {
            auxArray[auxPtr++] = array[i++];
        }

        while (j <= high) {
            auxArray[auxPtr++] = array[j++];
        }

        for (auxPtr = 0, i = low; i <= high; i++, auxPtr++) {
            array[i] = auxArray[auxPtr];
        }
    }
}
