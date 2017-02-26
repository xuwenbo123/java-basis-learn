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
            mergeSort(array, auxArray, low, dividedIndex); // 左边递归归并排序
            mergeSort(array, auxArray, dividedIndex + 1, high); // 右边递归归并排序
            mergeArray(array, auxArray, low, dividedIndex, high); // 合并分治结果
        }
    }

    private void mergeArray(int[] array, int[] temp, int low, int dividedIndex, int high) {
        int i = low; // 指向左半分区的指针
        int j = dividedIndex + 1; // 指向右半分区的指针
        int k = 0; // 指向辅助数组的指针

        while (i <= dividedIndex && j <= high) {
            if (array[i] > array[j]) {
                temp[k++] = array[j++];
            } else {
                temp[k++] = array[i++];
            }
        }

        while (i <= dividedIndex) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        // 最后把辅助数组的元素复制到原来的数组中去，归并排序结束
        for (i = low, k = 0; i <= high; i++, k++) {
            array[i] = temp[k];
        }
    }
}