package com.jerome.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, new ArrayList<>());
        System.out.println(map);
        map.computeIfAbsent(2, k -> new ArrayList<>()).add(2);
        System.out.println(map);
        map.computeIfPresent(1, (integer, integers) -> {
            integers.add(1);
            return integers;
        });
        System.out.println(map);
        map.compute(2,  (k, v) -> {
            if (v == null) {
                return new ArrayList<>();
            }
            v.add(1);
            return v;
        }).add(1);
        System.out.println(map);
        map.computeIfAbsent(3, k ->  {
            List<Integer> list = new ArrayList<>();
            list.add(3);
            return list;
        }).add(3);
        System.out.println(map);

    }
}