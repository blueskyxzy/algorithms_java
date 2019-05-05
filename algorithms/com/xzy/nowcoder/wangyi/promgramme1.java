package com.xzy.nowcoder.wangyi;

import java.util.Scanner;

/**
 * Created by xzy on 18/12/28  .
 */

//1. 给定两个点的坐标，求解两个点的距离（10 分）
//        给定两个点的坐标，求解两个点的距离。
//
//        输入格式:
//        给定四个浮点数，作为线段的两个点。
//
//        输出格式:
//        输出该线段的距离。
//
//        输入样例:
//        0 0 1.0 1.0
//
//        输出样例:
//
//        The distance is 1.41

public class promgramme1 {

    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
//        // 依次输入固定的4个数字
//        double a1 = s.nextDouble();
//        double a2 = s.nextDouble();
//        double b1 = s.nextDouble();
//        double b2 = s.nextDouble();

        // 一次输入4个数字，用空格分开
        String s1 = s.nextLine();
        String[] strs = s1.split(" ");
        double[] ints = new double[strs.length];
        for (int i = 0; i < strs.length; i++){
            ints[i] = Double.valueOf(strs[i]);
        }
        double a1 = ints[0];
        double a2 = ints[1];
        double b1 = ints[2];
        double b2 = ints[3];
        double result = function(a1, a2, b1, b2);
        System.out.println("The distance is " + result);
    }

    public static double function(double a1, double a2, double b1, double b2){
        return Math.sqrt(Math.abs(b1 - a1) + Math.abs(b2 - a2));
    }
}
