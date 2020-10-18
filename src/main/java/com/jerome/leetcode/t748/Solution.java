package com.jerome.leetcode.t748;

import java.util.Arrays;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String lowerPlate = licensePlate.toLowerCase();
        String[] lowerWords = Arrays.stream(words)
                .map(String::toLowerCase)
                .toArray(String[]::new);
        for (Character c : lowerPlate.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                for (int i = 0; i < lowerWords.length; i++) {
                    if (lowerWords[i] != null
                            && !lowerWords[i].contains(c.toString())) {
                        lowerWords[i] = null;
                    }
                }
            }
        }
        String result = null;
        for (String lowerWord : lowerWords) {
            if (result == null || (lowerWord != null
                    && lowerWord.length() < result.length())) {
                result = lowerWord;
            }
        }
        return result;
    }
}