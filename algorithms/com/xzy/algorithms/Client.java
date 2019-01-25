package com.xzy.algorithms;

import java.util.Arrays;

/**
 * created by xzy on 2019-01-25
 **/

public class Client {

    public static void main(String[] args){
        int[] arr = {66, 13, 51, 76, 81, 27, 57, 69, 23, 27, 64, 39};
//        popSort.popDoubleLoop(arr);
//        popSort.popSingleLoop(arr);
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println("result:" + Arrays.toString(arr));

    }
}
