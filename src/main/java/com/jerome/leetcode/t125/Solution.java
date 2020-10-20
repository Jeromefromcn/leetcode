package com.jerome.leetcode.t125;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail) {
            if (!Character.isLetterOrDigit(s.charAt(head))) {
                head++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
                continue;
            }
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            } else {
                head++;
                tail--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }
}