package com.jerome.ds.queue;

import com.google.common.collect.ImmutableList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {


    private Boolean[] dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new Boolean[s.length() + 1];
        return dfs(s, s.length(), new HashSet<>(wordDict));
    }

    private boolean dfs(String s, int len, Set<String> dict) {
        if (len == 0) {
            return true;
        }
        if (dp[len] != null) {
            return dp[len];
        }
        int i = len - 1;
        dp[len] = false;
        while (i >= 0) {
            if (dict.contains(s.substring(i, len))) {
                if (dp[i] == null) {
                    dp[i] = dfs(s, i, dict);
                }
                if (Boolean.TRUE.equals(dp[i])) {
                    dp[len] = true;
                }
            }
            i--;
        }
        return dp[len];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().wordBreak("catsandog",
                ImmutableList.of("cats", "dog", "sand", "and", "cat")));
        //"catsandog"
        //["cats", "dog", "sand", "and", "cat"]
    }
}