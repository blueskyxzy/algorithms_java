package com.xzy.leetcode;

/**
 * @description:
 * @author:
 * @date: 2023/8/24 17:07
 **/

import java.util.HashMap;
import java.util.Map;

/**
  leetcode0003  不重复字符最长子串
给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: s = "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:

        输入: s = "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:

        输入: s = "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。


        提示：

        0 <= s.length <= 5 * 104
        s 由英文字母、数字、符号和空格组成
        */
public class Leet0003 {

    // 滑动窗口解法
    public static int lengthOfLongestSubstring(String s) {
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

    public static void main(String[] args) {
        String a = "abcabcbb";
        int result = lengthOfLongestSubstring(a);
        System.out.println("result:" + result);
    }

}
