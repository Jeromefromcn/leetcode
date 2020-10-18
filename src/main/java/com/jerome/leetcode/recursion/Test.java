package com.jerome.leetcode.recursion;

public class Test {
    public static Integer sum(Integer[] arr) {
        return sum(arr, 0);
    }

    private static Integer sum(Integer[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, ++index);
    }

    public static void main(String[] args) {
        System.out.println(sum(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
