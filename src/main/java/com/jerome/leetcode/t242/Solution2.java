package com.jerome.leetcode.t242;

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (char c : s.toCharArray()) {
            table[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            table[c - 'a'] -= 1;
            if (table[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}