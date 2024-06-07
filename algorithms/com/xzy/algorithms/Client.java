package com.xzy.algorithms;

import java.util.Arrays;

/**
 * created by xzy on 2019-01-25
 **/

public class Client {

    public static void main(String[] args){
        int[] arr = {66, 13, 51, 76, 81, 27, 57, 69, 23, 27, 64, 39};
        popSort.popDoubleLoop(arr);
//        popSort.popSingleLoop(arr);
//        quickSort.sort(arr, 0, arr.length - 1);
//        insertSort.sort(arr);
//        shellSort.sort(arr);
//        mergeSort.sort(arr, 0, arr.length - 1);
//        selectSort.sort(arr);
        System.out.println("result:" + Arrays.toString(arr));
        int[][] arrs ={ {0, 5, 3, 0, 0, 0},
                        {5, 0, 0, 3, 1, 0},
                        {3, 0, 0, 2, 0, 0},
                        {0, 3, 2, 0, 0, 6},
                        {0, 1, 0, 0, 0, 2},
                        {0, 0, 0, 6, 2, 0}};
        minPath.sort(arrs);
    }
}
