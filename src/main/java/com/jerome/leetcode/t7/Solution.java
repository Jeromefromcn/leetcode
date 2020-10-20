package com.jerome.leetcode.t7;

class Solution {
    public static void main(String[] args) {
        new Solution().reverse(-2147483648);
    }

    public int reverse(int x) {
        boolean negativeSign = x < 0;
        long ll = x;
        if (negativeSign) {
            ll = Math.abs(ll);
        }
        String s = String.valueOf(ll);
        char[] c = s.toCharArray();
        reverseString(c);
        Long l = Long.parseLong(String.valueOf(c)) * (negativeSign ? -1 : 1);
        if ((!negativeSign && l > Integer.MAX_VALUE) || (negativeSign && l < Integer.MIN_VALUE)) {
            return 0;
        } else {
            return l.intValue();
        }
    }

    private void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}