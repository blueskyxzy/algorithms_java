package com.xzy.algorithms;

/**
 * created by xzy on 2019-01-25
 **/

// 希尔排序
public class shellSort {

    public static void sort(int[] arr){
        int d = arr.length/2; // 增量
        while(d > 0){
            for(int i = d; i < arr.length; i++){
                if (arr[i] < arr[i-d]){
                    // 插入
                    int key = arr[i];
                    int j = i - d;
                    while(j >= 0 && arr[j] > key){
                        arr[j+d] = arr[j];
                        j -= d;
                    }
                    arr[j+d] = key;
                }
            }
            d /= 2;
        }
    }
}
