package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-06-24

import java.util.Scanner;

/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
*/

// 代码的完整性
// 调整数组顺序使奇数位于偶数前面
public class Test13 {

    public static void main(String[] args) {
        int[] arrays = {1, 3, 4, 8, 5, 6, 7, 2, 3};
        reOrderArray(arrays);
        for (int x:arrays){
            System.out.println(x);
        }

    }

    // 方法一：新数组存放，思路清晰，简单，空间复杂度大，时间复杂度O(n)
/*    public static void reOrderArray(int [] array) {
        if(array.length==0||array.length==1) return;
        int oddCount=0,oddBegin=0;
        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) oddCount++;
        }
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) newArray[oddBegin++]=array[i];
            else newArray[oddCount++]=array[i];
        }
        for(int i=0;i<array.length;i++){
            array[i]=newArray[i];
        }
    }*/

    public static void reOrderArray(int [] array){
        //插入排序的思想
        int m = array.length;
        int k = 0;//记录已经摆好位置的奇数的个数
        for (int i = 0; i < m; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > k) {//j >= k+1
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;
                }
                k++;
            }
        }
    }
}
