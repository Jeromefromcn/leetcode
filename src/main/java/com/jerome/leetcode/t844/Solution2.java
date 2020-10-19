package com.jerome.leetcode.t844;

class Solution2 {
    public boolean backspaceCompare(String S, String T) {
        return handle(S).equals(handle(T));
    }

    private String handle(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}