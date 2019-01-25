package com.xzy.algorithms;

/**
 * created by xzy on 2019-01-25
 **/

// 冒泡排序
public  class popSort {

    // 双循环冒泡  比较+交换  for + for + if + 交换
    public static void popDoubleLoop(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    // 单循环冒泡 for + if + 交换 + if
    // 在for循环中判断当前循环是否结束，如果结束，修改i为初始值和减少长度
    public static void popSingleLoop(int[] arr){
            int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            if(arr[i] > arr[i+1]){
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }
            if(i == length - 2){
                i = 0;
                length--;
            }
        }

    }



}
