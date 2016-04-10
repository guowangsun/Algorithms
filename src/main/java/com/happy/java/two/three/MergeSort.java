package com.happy.java.two.three;

/**
 * Author : guowang.sun
 * Date : 16/4/10
 * Time : 下午3:00
 * <p/>
 * 归并排序
 */
public class MergeSort {
    /**
     * 归并排序
     */
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, mid + 1, end);
        }
    }

    private static void merge(int[] array, int start1, int end1, int start2, int end2) {
        int length = end2 - start1 + 1;
        int temp = start1;
        int[] result = new int[length];
        int i = 0;
        while (start1 <= end1 && start2 <= end2) {
            if (array[start1] < array[start2]) {
                result[i++] = array[start1++];
            } else {
                result[i++] = array[start2++];
            }
        }
        if (start1 <= end1) {
            while (start1 <= end1) {
                result[i++] = array[start1++];
            }
        }
        if (start2 <= end2) {
            while (start2 <= end2) {
                result[i++] = array[start2++];
            }
        }
        for (int j = 0; j < result.length; ++j) {
            array[temp++] = result[j];
        }
    }
}
