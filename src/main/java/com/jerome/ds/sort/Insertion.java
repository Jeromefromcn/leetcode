package com.jerome.ds.sort;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class Insertion {
    public static void main(String[] args) {
        Stopwatch sw = Stopwatch.createStarted();
        int[] array = new int[]{5, 3, 7, 4, 1, 6, 9};
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS));

        for (int i : array) {
            System.out.print(i);
            System.out.print(", ");
        }

    }


}
