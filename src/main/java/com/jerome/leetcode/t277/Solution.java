package com.jerome.leetcode.t277;/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        for (int i = 0; i < n; i++) {
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (knows(i, j)) {
                    count2++;
                }
                if (knows(j, i)) {
                    count1++;
                }
                if (count1 == n - 1 && count2 == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}

class Relation {
    boolean knows(int a, int b) {
        return true;
    }
}