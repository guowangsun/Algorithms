package com.happy.java.two.one;

/**
 * Author : guowang.sun
 * Date : 16/4/10
 * Time : 下午1:49
 * <p/>
 * 插入排序
 */
public class InsertionSort {

    /**
     * 排序数组，不对原数组改变
     */
    public static int[] insertionSort(int[] array, boolean asc) {
        if (array == null) {
            return new int[0];
        }
        int[] result = new int[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        for (int i = 1; i < result.length; ++i) {
            int key = result[i];
            int j = i - 1;
            for (; j > -1 && (asc ? result[j] > key : result[j] < key); --j) {
                result[j + 1] = result[j];
            }
            result[j + 1] = key;
        }
        return result;
    }
}
