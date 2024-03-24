package com.xzy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xzy
 * @create: 2024-03-24
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 **/

public class Leet0003 {

    // 滑动窗口法
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left = 0;
        int right = 0;
        int max = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        while (right < len){
            char c = s.charAt(right);
            Integer num = hashMap.getOrDefault(c, 0);
            hashMap.put(c, ++num);

            //不满足不重复的条件则左指针右移
            while (hashMap.get(c) > 1){
                char leftChar = s.charAt(left);
                hashMap.put(leftChar, hashMap.get(leftChar) - 1);
                left ++;
            }
            max = Math.max(max, right - left + 1);
            right ++;
        }
        return max;
    }
}
