package com.jerome.leetcode.t278;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    private int firstBadVersion(int first, int last) {
        int version = (first + last) / 2;
        if (isBadVersion(version)) {
            if (!isBadVersion(version - 1)) {
                return version;
            } else {
                return firstBadVersion(first, version - 1);
            }
        } else {
            return firstBadVersion(version + 1, last);
        }

    }


}


class VersionControl {
    boolean isBadVersion(int version) {
        return false;
    }
}