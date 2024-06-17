package com.xzy.leetcode;

/**
 * @author: xzy
 * @create: 2024-06-17
 *
 * 前K个高频词汇
 * 给定一个单词列表 words 和一个整数 k ，返回前 k 个出现次数最多的单词。
 *
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率， 按字典顺序 排序。
 *
 *
 *
 * 示例 1：
 *
 * 输入: words = ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * 输出: ["i", "love"]
 * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 *     注意，按字母顺序 "i" 在 "love" 之前。
 * 示例 2：
 *
 * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * 输出: ["the", "is", "sunny", "day"]
 * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
 *     出现次数依次为 4, 3, 2 和 1 次。
 *
 **/

public class Leet0692 {

    public static void main(String[] args) {
        // 方法一：哈希表 + 排序 Collections.sort(rec, new Comparator<String>() {
        //            public int compare(String word1, String word2) {
        //                return cnt.get(word1) == cnt.get(word2) ? word1.compareTo(word2) : cnt.get(word2) - cnt.get(word1);
        //            }
        //        });
        //  return rec.subList(0, k);

        // 方案二：优先队列

    }

}
