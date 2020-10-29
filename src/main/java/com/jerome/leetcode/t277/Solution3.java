package com.jerome.leetcode.t277;/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 extends Relation {
    public int findCelebrity(int n) {
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (knows(candidate, i)) {
                candidate = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != candidate && knows(candidate, i) || !knows(i, candidate)) {
                return -1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        System.out.println(Math.max(stack.peek(), 1));

    }
}