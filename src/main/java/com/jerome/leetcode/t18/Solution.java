package com.jerome.leetcode.t18;

import java.util.Arrays;

class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int count = 0;
        int drp = drinks.length - 1;
        for(int s : staple) {
            if(s > x) {
                break;
            }
            for(int i = drp; i >= 0; i--) {
                if(s + drinks[i] > x) {
                    drp--;
                    continue;
                } else {
                    count = (count + drp + 1) % 1000000007;
                    break;
                }
            }
        }
        return count;

    }
}
