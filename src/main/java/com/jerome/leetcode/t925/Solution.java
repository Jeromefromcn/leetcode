package com.jerome.leetcode.t925;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int slow = 0, fast = 0;
        while (fast < typed.length()) {
            if (slow < name.length() && name.charAt(slow) == typed.charAt(fast)) {
                slow++;
                fast++;
            } else if (fast > 0 && typed.charAt(fast) == typed.charAt(fast - 1)) {
                fast++;
            } else {
                return false;
            }
        }
        return slow == name.length();
    }

    public static void main(String[] args) {
        new Solution().isLongPressedName("alex", "aaleex");
    }
}