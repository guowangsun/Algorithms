package com.happy.java.two.one;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Author : guowang.sun
 * Date : 16/4/10
 * Time : 下午2:21
 */
public class InsertionSortTest {

    private static final Random RANDOM = new Random();

    @Test
    public void testInsertionSort() throws Exception {
        int[] test = new int[10];
        for (int i = 0; i < test.length; ++i) {
            test[i] = RANDOM.nextInt(20);
        }
        int[] result = InsertionSort.insertionSort(test, true);
        for (int i = 1; i < result.length; ++i) {
            if (result[i - 1] > result[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testInsertionSortDesc() throws Exception {
        int[] test = new int[10];
        for (int i = 0; i < test.length; ++i) {
            test[i] = RANDOM.nextInt(20);
        }
        int[] result = InsertionSort.insertionSort(test, false);
        for (int i = 1; i < result.length; ++i) {
            if (result[i - 1] < result[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        System.out.println(Arrays.toString(result));
    }
}