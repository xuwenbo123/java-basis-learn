package com.webb.basis.algorithm;

public class ShellSorter extends Sorter {
    @Override
    public void sort(int[] array) {
        int d = array.length;

        do {
            d /= 2;
            System.out.println(d);
            shellPass(array, d); // 根据逐渐减少的间隔增量，循环调用一次排序
        } while (d > 1);
    }

    private void shellPass(int[] array, int d) {
        int tmp;

        for (int i = d; i < array.length; i++) { // 数组下标从0开始，初始i=d表示一次排序中第二个元素
            tmp = array[i];

            // 如果待处理的无序区第一个元素 < 有序区最大的元素array[i - d]
            // 需要将有序区比array[i]大的元素向后移
            if (array[i] < array[i - d]) {
                int j = i - d;
                while (j >= 0 && tmp < array[j]) {
                    array[j + d] = array[j];
                    j -= d;
                }

                array[j + d] = tmp;
            }
        }
    }
}
