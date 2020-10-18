package com.jerome.leetcode.t1002;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] stringArray) {
        // 找到数组A中字符串长度最短的其中一个字符串s
        String longestString = stringArray[0];
        for(String s : stringArray) {
            if(s.length() < longestString.length()) {
                longestString = s;
            }
        }
        // 遍历s中的每一个字符, 如果该字符在A数组的每个字符串中都出现则加入到返回List result中
        List<String> result = new ArrayList<>();
        int stringSize = stringArray.length;
        for(Character c : longestString.toCharArray()) {
            int count = 0;
            for (String s : stringArray) {
                if (s.indexOf(c) != -1) {
                    count++;
                }
            }
            if (count == stringSize) {
                result.add(c.toString());
                for (int i = 0; i < stringArray.length; i++) {
                    String s = stringArray[i];
                    int position = s.indexOf(c);
                    stringArray[i] = s.substring(0, position) + s.substring(position + 1);
                }
            }
        }
        // 返回List result
        return result;
    }
}