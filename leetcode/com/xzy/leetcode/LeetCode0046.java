package com.xzy.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-27
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出：[[1]]
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 **/

public class LeetCode0046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 回溯思想
        String s = in.nextLine();
        String[] split = s.split(",");
        int[] nums = new int[split.length];
        for (int i =0; i < split.length; i++){
            nums[i] = Integer.valueOf(split[i]);
        }
        permute(nums);
    }


    // 定义递归函数 backtrack(first,output)\textit{backtrack}(\textit{first}, \textit{output})backtrack(first,output) 表示从左往右填到第 first\textit{first}first 个位置，当前排列为 output\textit{output}output。 那么整个递归函数分为两个情况：
    //
    //如果 first=n\textit{first} = nfirst=n，说明我们已经填完了 nnn 个位置（注意下标从 000 开始），找到了一个可行的解，我们将 output\textit{output}output 放入答案数组中，递归结束。
    //如果 first<n\textit{first} < nfirst<n，我们要考虑这第 first\textit{first}first 个位置我们要填哪个数。根据题目要求我们肯定不能填已经填过的数，因此很容易想到的一个处理手段是我们定义一个标记数组 vis\textit{vis}vis 来标记已经填过的数，那么在填第 first\textit{first}first 个数的时候我们遍历题目给定的 nnn 个数，如果这个数没有被标记过，我们就尝试填入，并将其标记，继续尝试填下一个位置，即调用函数 backtrack(first+1,output)\textit{backtrack}(\textit{first} + 1, \textit{output})backtrack(first+1,output)。回溯的时候要撤销这一个位置填的数以及标记，并继续尝试其他没被标记过的数。
    //使用标记数组来处理填过的数是一个很直观的思路，但是可不可以去掉这个标记数组呢？毕竟标记数组也增加了我们算法的空间复杂度。
    //

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public static void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }



}
