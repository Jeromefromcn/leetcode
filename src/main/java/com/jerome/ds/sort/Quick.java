package com.jerome.ds.sort;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class Quick {
    public static void main(String[] args) {
        Stopwatch sw = Stopwatch.createStarted();
        int[] array = new int[]{5, 3, 7, 4, 1, 6, 2};
        doQuick(array, 0, array.length - 1);

        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS));

        for (int i : array) {
            System.out.print(i);
            System.out.print(", ");
        }

    }

    private static void doQuick(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = array[right];
        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            while (leftIndex < right && array[leftIndex] <= pivot) {
                leftIndex++;
            }
            while (rightIndex >= left && array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex > rightIndex) {
                break;
            }
            swap(array, leftIndex, rightIndex);
        }
        swap(array, leftIndex, right);
        doQuick(array, left, leftIndex - 1);
        doQuick(array, leftIndex + 1, right);
    }

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

}
