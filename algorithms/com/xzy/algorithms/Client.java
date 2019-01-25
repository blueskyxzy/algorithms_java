package com.xzy.algorithms;

import java.util.Arrays;

/**
 * created by xzy on 2019-01-25
 **/

public class Client {

    public static void main(String[] args){
        int[] arr = {66, 13, 51, 76, 81, 26, 57, 69, 23};
//        popSort.popDoubleLoop(arr);
        popSort.popSingleLoop(arr);
        System.out.println("result:" + Arrays.toString(arr));

    }
}
