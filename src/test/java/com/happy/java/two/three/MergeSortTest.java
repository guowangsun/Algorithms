package com.happy.java.two.three;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Author : guowang.sun
 * Date : 16/4/10
 * Time : 下午4:02
 */
public class MergeSortTest {
    private static final Random RANDOM = new Random();

    @Test
    public void testMergeSort() throws Exception {
        int[] test = new int[10];
        for (int i = 0; i < test.length; ++i) {
            test[i] = RANDOM.nextInt(20);
        }
        MergeSort.mergeSort(test);
        for (int i = 1; i < test.length; ++i) {
            if (test[i - 1] > test[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        System.out.println(Arrays.toString(test));
    }
}