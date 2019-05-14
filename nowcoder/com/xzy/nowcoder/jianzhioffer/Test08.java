package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-14

//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

import java.util.Scanner;

//跳台阶 递归和循环
public class Test08 {
    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int result = JumpFloor(i);
        System.out.println(result);
    }

    // 动态规划  f(n) = f(n-1) + f(n-2)
    // 使用3变量方式，不采用递归的方式，降低时间复杂度
    public static int JumpFloor(int target) {
        if (target <= 1){
            return 1;
        } else if (target == 2){
            return 2;
        }
        int a = 1;int b = 2;
        int c = 0;
        for(int i = 2; i < target; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
