package com.jerome.al;

public class QuickSort {

    private void sort(int[] array) {
        if (array == null) {
            return;
        }
        doQuick(array, 0, array.length - 1);
    }

    private void doQuick(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = array[right];
        int leftIndex = left;
        int rightIndex = right - 1;
        while (true) {
            while (leftIndex < right && array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (rightIndex >= left && array[rightIndex] >= pivot) {
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

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 1, 8, 2, 5, 7, 3, 1, 6, 4, 5};
        new QuickSort().sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}