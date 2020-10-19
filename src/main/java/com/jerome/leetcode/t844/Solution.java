package com.jerome.leetcode.t844;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        while (S.contains("#")) {
            int index = S.indexOf('#');
            if (index == 0) {
                S = S.substring(1);
            } else {
                S = S.substring(0, index - 1) + S.substring(index + 1);
            }
        }
        while (T.contains("#")) {
            int index = T.indexOf('#');
            if (index == 0) {
                T = T.substring(1);
            } else {
                T = T.substring(0, index - 1) + T.substring(index + 1);
            }
        }
        return S.equals(T);
    }

    public static void main(String[] args) {
        System.out.println("#234234".indexOf('#'));
        System.out.println("#234234".substring(1));
        System.out.println("#234234".substring(0, 1));
        System.out.println("123#4234".substring(0, 1));
    }
}