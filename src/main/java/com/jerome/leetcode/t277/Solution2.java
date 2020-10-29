package com.jerome.leetcode.t277;/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution2 extends Relation {
    public int findCelebrity(int n) {
        for (int i = 0; i < n; i++) {
            boolean continueFlag = false;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (knows(i, j)) {
                    continueFlag = true;
                    break;
                }
            }
            if (continueFlag) {
                continue;
            } else {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (knows(j, i)) {
                        count++;
                    }
                }
                if (count == n - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}