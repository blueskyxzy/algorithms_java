package com.xzy.nowcoder.jianzhioffer;

import java.util.Scanner;

/**
 * Created by xzy on 2019/6/21  .
 */

// 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
// 递归和循环
// 矩形覆盖
public class Test10 {

    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            int result = RectCover(i);
            System.out.println("一共有：" + result + "种方法");
        }
    }

    // 动态规划的方法  f(n) = f(n-2) + f(n-1)
    public static int RectCover(int target) {
        int result = 0;
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        for(int i = 2; i < target; i++){
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

}

