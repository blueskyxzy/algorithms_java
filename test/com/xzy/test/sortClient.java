package com.xzy.test;

import java.util.function.DoubleToIntFunction;

/**
 * @author: xzy
 * @create: 2024-06-06
 **/

public class sortClient {

    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 6, 7, 2, 9, 4};
//       popSort(arr);
//        quickSort(arr);
        mergerSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    // 归并排序
    private static void mergerSort(int[] arr) {
        // 先从mid拆分2个
        mergerSort(arr, 0, arr.length - 1);
    }

    // 归并排序递归
    private static void mergerSort(int[] arr, int left, int right) {
        // 递归拆分
        int mid = (right + left) / 2;
        if (left < right) {
            mergerSort(arr, left, mid);
            mergerSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // 归并排序合并方法
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int k = 0;
        int i = left;
        int j = mid + 1;
        while ((i <= mid) && (j <= right)) {
            if (arr[i] > arr[j]) {
                tmp[k++] = arr[j++];
            } else {
                tmp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= right) {
            tmp[k++] = arr[j++];
        }
        for (int x = 0; x < tmp.length; x++) {
            arr[left+x] = tmp[x];
        }
    }

    // 快速排序
    private static void quickSort(int[] arr) {
        int length = arr.length;
        int low = 0;
        int high = length - 1;
        quickSort(arr, low, high);
    }


    // 快速排序递归
    private static void quickSort(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int x = arr[left];
        while (left < right) {
            while (x <= arr[right] && left < right) {
                right--;
            }
            if (x > arr[right]) {
                // 交换
                int tmp = arr[right];
                arr[right] = x;
                arr[left] = tmp;
            }

            while (x >= arr[left] && left < right) {
                left++;
            }
            if (x < arr[left]) {
                // 交换
                int tmp = arr[left];
                arr[left] = x;
                arr[right] = tmp;
            }

            // 递归拆分
            if (left > low) {
                quickSort(arr, low, left - 1);
            }
            if (high > right) {
                quickSort(arr, right + 1, high);
            }

        }
    }


    // 冒泡排序
    private static void popSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // 交换
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
            if (i == len - 2) {
                i = 0;
                len--;
            }
        }
    }

}
