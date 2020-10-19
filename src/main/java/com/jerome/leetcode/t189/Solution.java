package com.jerome.leetcode.t189;

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        new Solution().rotate(arr, 3);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] arr2 = new int[]{-1, -100, 3, 99};
        new Solution().rotate(arr2, 2);
        for (int i : arr2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(arr3, 3);
        for (int i : arr3) {
            System.out.print(i + ", ");
        }
    }

    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int length = nums.length;
        k = k % length;
        int count = 0;
        int current = 0;
        int prev = 0;
        for (int j = 0; count < length; j++) {
            current = j;
            int temp = nums[current];
            prev = current;
            for (int i = j; i < nums.length - 1; i++) {
                int next = (current - k + length) % length;
                if (prev == next) {
                    break;
                }
                nums[current] = nums[next];
                current = next;
                count++;
            }
            nums[current] = temp;
            count++;
        }
    }
}