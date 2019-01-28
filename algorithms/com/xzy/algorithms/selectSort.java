package com.xzy.algorithms;

/**
 * created by xzy on 2019-01-25
 **/

// 直接选择排序
public class selectSort {

    public static void sort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++){
            for (int j = i; j<length; j++){
                if (arr[j] < arr[i]){
                    int tmp  = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}
