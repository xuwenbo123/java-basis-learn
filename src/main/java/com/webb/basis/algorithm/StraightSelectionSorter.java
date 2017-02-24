package com.webb.basis.algorithm;

/**
 * 直接选择排序
 **/
public class StraightSelectionSorter extends Sorter {
    @Override
    public void sort(int[] array) {
        /**
         * n个记录文件的直接选择排序可经过n-1次直接排序得到结果
         *
         * 1. 初始状态：无序区为R[1...n],有序区为空
         * 2. 第一次排序：在无序区R[1...n]中选出关键字最小的记录R[k],
         *    将它与无序区的第一个记录R[1]交换，使R[1...1]和R[2...n]分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区
         * 3. ...
         */

        int tmp;

        for (int i = 0; i < array.length - 1; i++) {
            int k = i;

            for (int j = i + 1; j < array.length; j++) { // 该循环可以找出右侧无序区最小的元素array[k]
                if (array[k] > array[j]) {
                    k = j; // 将无序区最小的值赋值到k
                }
            }

            if (k != i) { // 如果array[i]不是无序区最小的，需要与无序区最小的进行交换
                tmp = array[i];
                array[i] = array[k];
                array[k] = tmp;
            }
            // 如果array[i]是无序区最小的元素，不需要执行交换
        }

        System.out.println("直接选择结果:");

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
