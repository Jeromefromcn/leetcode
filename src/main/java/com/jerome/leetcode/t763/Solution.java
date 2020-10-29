package com.jerome.leetcode.t763;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int[] array = new int[26];
        for (int i = 0; i < S.length(); i++) {
            array[S.charAt(i) - 'a'] = i;
        }
        int i = 0;
        while (i < S.length()) {
            int end = array[S.charAt(i) - 'a'];
            int j = i;
            while (j != end) {
                end = Math.max(end, array[S.charAt(j++) - 'a']);
            }
            result.add(end - i + 1);
            i = j + 1;
        }

        return result;

    }
}