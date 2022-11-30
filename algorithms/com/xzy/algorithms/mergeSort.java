package com.xzy.algorithms;

/**
 * created by xzy on 2019-01-25
 **/

// 归并排序
public class mergeSort {

    // 分成两个序列，2个序列合并成一个有序+递归
    public static void sort(int[] arr, int low, int high){
        int mid = (low + high)/2;
        if (low < high){
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    // 归并
    private static void merge(int[] arr, int low, int mid, int high) {
        int[] tmp = new int[high-low+1];
        int i = low, j = mid + 1, k = 0;
        while(i <= mid && j <= high){
            if (arr[i] < arr[j]){
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            tmp[k++] = arr[i++];
        }

        while(j <= high){
            tmp[k++] = arr[j++];
        }

        for (int x = 0; x< tmp.length; x++){
            arr[x+low] = tmp[x];
        }
    }

    // 将有序数组a[]和b[]合并到c[]中
    // 归并是对多个有序序列排序成一个有序的算法。
    // 对于一个无序序列，分成多个长度为1的有序序列，递归，即可完成无序序列的归并排序
    void MemeryArray(int a[], int n, int b[], int m, int c[])
    {
        int i, j, k;

        i = j = k = 0;
        while (i < n && j < m)
        {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < n)
            c[k++] = a[i++];

        while (j < m)
            c[k++] = b[j++];
    }
}
