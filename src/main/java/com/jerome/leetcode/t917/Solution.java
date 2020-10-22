package com.jerome.leetcode.t917;

class Solution {
    public String reverseOnlyLetters(String S) {
        int front = 0;
        int end = S.length() - 1;
        char[] array = S.toCharArray();
        char temp;
        while (front < end) {
            while (front < end && !Character.isLetter(array[front])) {
                front++;
            }
            while (front < end && !Character.isLetter(array[end])) {
                end--;
            }
            temp = array[front];
            array[front++] = array[end];
            array[end--] = temp;
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}