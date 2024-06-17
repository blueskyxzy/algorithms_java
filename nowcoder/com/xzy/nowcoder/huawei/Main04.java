package com.xzy.nowcoder.huawei;


/**
 * @author: xzy
 * @create: 2024-06-17
 * <p>
 * 题目描述
 * 给定一个整型数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 解答要求时间限制：1000ms, 内存限制：64MB
 * 输入
 * 第一行一个整数n(n>0)，表示数组长度n
 * 第二行n个数组元素整数，以空格分开
 * 输出
 * 一行中n个数组元素整数，以空格分开，行尾无空格
 * 样例
 * 输入样例 1 复制
 * 3
 * 0 0 1
 * 输出样例 1
 * 1 0 0
 * 提示样例 1
 * <p>
 * <p>
 * 输入样例 2 复制
 * 5
 * 0 1 0 3 12
 * 输出样例 2
 * 1 3 12 0 0
 * 提示样例 2
 * <p>
 * <p>
 * 提示
 * 1.	必须在原数组上操作，不能拷贝额外的数组。
 * 2.	尽量减少操作次数。
 **/

// 注意类名必须为 Main, 不要有任何 package xxx 信息

public class Main04 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] nums1 = new int[]{0, 1, 0, 0, 3, 12};
        nums = exchangeZero(nums1, 6);
        for (Integer num : nums) {
            System.out.println(num);
        }
    }

    private static int[] exchangeZero(int[] nums, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (nums[left] == 0) {
                for (int i = left; i < right; i++) {
                    nums[i] = nums[i + 1];
                }
                nums[right] = 0;
                right--;
            } else {
                left++;
            }
        }
        return nums;
    }

}
