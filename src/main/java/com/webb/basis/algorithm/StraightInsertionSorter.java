package com.webb.basis.algorithm;

/**
 * 直接插入排序
 */
public class StraightInsertionSorter extends Sorter {

    @Override
    public void sort(int[] array) {
        /**
         * 假设待排序的记录存放在数组R[0...n-1]中。初始时，R[0]自成1个有序区，无序区为R[1...n-1]。从i=1开始到i=n-1为止，
         * 依次将R[i]插入到当前有序区R[0...n-1]中，生成含n个记录的有序区
         */
        int tmp;

        for (int i = 1; i < array.length; i++) {
            tmp = array[i];

            if (array[i - 1] > array[i]) {
                // 如果左侧有序区最大的array[i-1] > 右侧无序区的第一个元素array[i]
                // 需要将有序区比array[i]大的元素往后移
                int j = i - 1;
                while (j >= 0 && tmp < array[j]) { // 从右到左扫描有序区
                    array[j + 1] = array[j]; // 将有序区中比array[i]大的元素都往后移
                    j--;
                }
                // 如果array[i] >= 左侧有序区最大的array[i-1]，或者经过扫描移动后，找到一个比array[i]小的元素
                // 将右侧无序区第一个元素tmp = array[i]放到正确的位置上
                array[j + 1] = tmp;
            }
        }
    }

}
