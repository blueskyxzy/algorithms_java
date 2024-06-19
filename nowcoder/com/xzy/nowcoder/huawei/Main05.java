package com.xzy.nowcoder.huawei;

import java.util.*;

/**
 * @author: xzy
 * @create: 2024-06-17
 * 问题描述：
 * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
 * 例如，如果这个列表是 [“same”, “me”, “bell”]，我们就可以将其表示为 S = “same#bell#” 和 indexes = [0, 2, 5]。
 * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 “#” 结束，来恢复我们之前的单词列表。
 * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 * 示例1：
 * 输入： words = ["same", "me", "bell"]
 * 输出：10
 * 说明：S= "same#bell#"，indexes=[0,2,5]
 * 示例2：
 * 输入： words = ["bell", "me", "same", "bell"]
 * 输出：10
 * 说明：S= "bell#same#"，indexes=[0,7,5,0]
 * 提示：
 * 1.	 1 <= words.length <= 2000
 * 2.	1 <= words[i].length < =7
 * 3.	每个单词都是小写字母
 **/

// 题解：判断后缀，hashset或者hash

public class Main05 {
    public static void main(String[] args) {
        String[] words = new String[]{"same", "me", "bell"};
        String[] words1 = new String[]{"bell", "me", "same", "bell"};
        int result = solution(words1);
        System.out.println(result);
    }

    public int minimumLengthEncoding(String[] words) {
        //我们用HashSet将字符串存起来
        Set<String> good = new HashSet(Arrays.asList(words));
        //遍历该字符串
        for (String word : words) {
            for (int k = 1; k < word.length(); ++k) {
                //将是其他单词后缀的单词从hashset中去掉
                good.remove(word.substring(k));
            }
        }
        int ans = 0;
        for (String word : good) {
            ans += word.length() + 1;
        }
        return ans;
    }

    class Solution {
        public int minimumLengthEncoding(String[] words) {
            TrieNode trie = new TrieNode();
            Map<TrieNode, Integer> nodes = new HashMap();

            for (int i = 0; i < words.length; ++i) {
                String word = words[i];
                TrieNode cur = trie;
                for (int j = word.length() - 1; j >= 0; --j) {
                    cur = cur.get(word.charAt(j));
                }
                nodes.put(cur, i);
            }

            int ans = 0;
            for (TrieNode node : nodes.keySet()) {
                if (node.count == 0) {
                    ans += words[nodes.get(node)].length() + 1;
                }
            }
            return ans;

        }
    }

    class TrieNode {
        TrieNode[] children;
        int count;

        TrieNode() {
            children = new TrieNode[26];
            count = 0;
        }

        public TrieNode get(char c) {
            if (children[c - 'a'] == null) {
                children[c - 'a'] = new TrieNode();
                count++;
            }
            return children[c - 'a'];
        }
    }


    private static int solution(String[] words) {
        int result = 1;
        for (String word : words) {
            result += word.length();
        }
        StringBuilder s = new StringBuilder();
        for (String word : words) {
            int len = word.length();
            if (s.toString().contains(word)) {
                if (len >= 1) {
                    result -= (len - 1);
                }
            } else {
                s.append(word);
            }
        }
        return result;
    }


}

