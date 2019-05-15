package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-15
/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
        求该青蛙跳上一个n级的台阶总共有多少种跳法。*/

import java.util.Scanner;

// 递归循环 变态跳台阶
public class Test09 {
    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            int i = s.nextInt();
            int result = JumpFloorII(i);
            System.out.println(result);
        }
    }

    //  0  1, 1  1,  2  2,  3  4,  4  8,   动态规划：f4 = f0 + f3 + f2 + f1
    public static int JumpFloorII(int target) {
         if (target <= 1 ) {
             return 1;
         }
         int f0 = 1;
         int f1 = 1;
         int fn = 0;
         int[] array = new int[target];
         array[0] = 1;
         for (int i = 1; i < target; i++){
             for (int j = 0; j < i; j ++){
                 array[i] += array[j];
             }
             array[i] += 1;
         }
         return array[target - 1];
    }

}
