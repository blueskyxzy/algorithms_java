package com.xzy.algorithms;

/**
 * created by xzy on 2019-01-25
 **/

// 直接插入排序
public class insertSort {

    public static void sort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i]; // 待插入的值
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
