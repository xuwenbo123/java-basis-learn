package com.webb.basis.algorithm;

public class Merge {

    public static void main(String[] args) {
        int[] arrayA = new int[] { 1, 6, 3, 4, 5 };
        int[] arrayB = new int[] { 2, 7, 8, 9 };
        int[] temp = new int[9];

        mergeArray(arrayA, arrayA.length, arrayB, arrayB.length, temp);

        for (int i : temp) {
            System.out.print(i + " ");
        }

    }

    /**
     * 将数组 arrayA[] 和 arrayB[] 合并到 arrayC[]
     */
    private static void mergeArray(int arrayA[], int lengthA, int arrayB[], int lengthB, int temp[]) {
        int i = 0, j = 0, k = 0;

        while (i < lengthA && j < lengthB) { // 将两个有序的数组合并，排序到辅助数组temp中
            if (arrayA[i] > arrayB[j]) {
                temp[k++] = arrayB[j++];
            }
            else {
                temp[k++] = arrayA[i++];
            }
        }

        while (i < lengthA) {   // 如果arrayA[] 中还没有合并完的，则直接将arrayA[]中没有合并的数组复制到辅助数组中
            temp[k++] = arrayA[i++];
        }

        while (j < lengthB) { // 如果arrayB[] 中还没有合并完的，则直接将arrayB[]中没有合并的数组复制到辅助数组中
            temp[k++] = arrayB[j++];
        }
    }

}
