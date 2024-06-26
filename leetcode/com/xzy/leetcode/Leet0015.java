package com.xzy.leetcode;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-29
 *
 * 三数之和
 *
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 *
 * 你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * 示例 2：
 *
 * 输入：nums = [0,1,1]
 * 输出：[]
 * 解释：唯一可能的三元组和不为 0 。
 * 示例 3：
 *
 * 输入：nums = [0,0,0]
 * 输出：[[0,0,0]]
 * 解释：唯一可能的三元组和为 0 。
 **/

public class Leet0015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 方法一 先排序，双指针
        //如何移动双指针呢?
        //            1>:nums[i] + nums[left] + nums[right] < 0
        //                说明我们需要更大的数，那就要往后移动left
        //            2>:nums[i] + nums[left] + nums[right] > 0
        //                说明我们需要更小的数,那就需要往前移动right
        //            3>:nums[i] + nums[left] + nums[right] == 0;
        //                这是我们找到一组合适的答案,那么接下来,就是移动 left,和 right,因为我们需要考虑下一组答案
        //                了;


    }


}
