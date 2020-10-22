package com.jerome.leetcode.t278;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution2 extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        while (first < n) {
            int version = first + (n - first) / 2;
            if (isBadVersion(version)) {
                n = version;
            } else {
                first = version + 1;
            }
        }
        return first;
    }


}
