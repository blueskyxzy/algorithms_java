package com.xzy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

 你可以按任意顺序返回答案。


 示例 1：

 输入：nums = [2,7,11,15], target = 9
 输出：[0,1]
 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 示例 2：

 输入：nums = [3,2,4], target = 6
 输出：[1,2]
 示例 3：

 输入：nums = [3,3], target = 6
 输出：[0,1]

 提示：

 2 <= nums.length <= 104
 -109 <= nums[i] <= 109
 -109 <= target <= 109
 只会存在一个有效答案
 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？

 *  哈希表
 * @author xzy*/

public class Leet0001 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // 要使时间复杂度低于o(n2),需要容器或者构造别的数据结构，这里可使用Map
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (int i=0; i < nums.length; i++){
            int key = nums[i];
            if (map.containsKey(key)){
                // 找到和为target
                return new int[] {map.get(key), i};
            } else {
                map.put(target- key, i);
            }
        }
        return new int[2];
    }

    public int[] twoSumHash3(int[] nums, int target) {
        // 首尾双指针加map
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int ln0 = nums[left];
            int rn0 = nums[right];
            int ln1 = target - ln0;
            int rn1 = target - rn0;
            if(map.containsKey(ln1)) {
                return new int[] {left, map.get(ln1)};
            }
            else {
                map.put(ln0, left++);
            }
            if(map.containsKey(rn1)) {
                return new int[] {right, map.get(rn1)};
            }
            else {
                map.put(rn0, right--);
            }
        }
        return new int[] {};
    }
}
