package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-06-24

import java.util.Scanner;

// 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
// 代码的完整性
// 数值的整数次方
public class Test12 {
    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner s = new Scanner(System.in);
        String x = s.next();
        String y = s.next();
        double result = Power(Double.valueOf(x), Integer.valueOf(y));
        System.out.println(result);
    }

    public static double Power(double base, int exponent) {
        double result = 1;
        if (exponent == 0){

        }
        boolean isMoreThanZero = true;
        if (exponent < 0){
            isMoreThanZero = false;
            exponent = -exponent;
        }
        for (int i=0; i<exponent; i++) {
            result *= base;
        }

        if (base == 0){
            return 0;
        }
        if (isMoreThanZero) return result;
        return 1/result;
    }
}
