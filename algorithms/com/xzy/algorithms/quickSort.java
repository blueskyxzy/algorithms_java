package com.xzy.algorithms;

/**
 * created by xzy on 2019-01-25
 **/

// 快速排序
public class quickSort {

    // 基准+2个索引+交换+二分+递归
    public static void sort(int[] arr, int low, int high){
        int x = arr[low]; // 基准
        int start = low;
        int end = high;

        while(start < end){
            // 从右向左
            while (arr[end] >= x && start < end){
                end--;
            }
            if (arr[end] < x){
                // 交换
                int tmp = arr[end];
                arr[end] = x;
                arr[start] = tmp;
            }

            // 从左往右
            while (arr[start] <= x && start < end){
                start++;
            }
            if (arr[start] > x) {
                // 交换
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }

        if (low < start) sort(arr, low, start - 1);
        if (end < high) sort(arr, end + 1, high);
    }

}
