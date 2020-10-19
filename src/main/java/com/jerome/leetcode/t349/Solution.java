package com.jerome.leetcode.t349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        List<Integer> list = new ArrayList<>(Math.min(set1.size(), set2.size()));
        for (Integer i : set1) {
            if (set2.contains(i)) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Number::intValue).toArray();
    }

}