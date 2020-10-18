package com.jerome.leetcode.t1002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<String> commonChars(String[] stringArray) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String s : stringArray) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                ++freq[c - 'a'];
            }
            for (int i = 0; i < minFreq.length; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < minFreq.length; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) ('a' + i)));
            }
        }
        return result;
    }
}