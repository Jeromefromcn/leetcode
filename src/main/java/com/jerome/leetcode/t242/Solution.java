package com.jerome.leetcode.t242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (mapS.containsKey(c)) {
                mapS.put(c, mapS.get(c) + 1);
            } else {
                mapS.put(c, 1);
            }
        }
        Map<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (mapT.containsKey(c)) {
                mapT.put(c, mapT.get(c) + 1);
            } else {
                mapT.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapT.entrySet()) {
            if (!mapS.containsKey(entry.getKey()) || !mapS.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        return true;

    }
}