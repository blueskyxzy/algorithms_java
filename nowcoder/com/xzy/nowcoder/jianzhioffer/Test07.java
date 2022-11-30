package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-13

//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//        n<=39

import java.util.Scanner;

public class Test07 {

    public static void main(String[] args) {
        System.out.println("请输入一个小于等于39，大于0的整数：");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int fibonacci = Fibonacci(i);
        System.out.println("out:" + fibonacci);
    }
    public static int Fibonacci(int n) {
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } if (n == 2){
            return 1;
        } else {
            int a = 1;
            int b = 1;
            int c = 2;
            for(int i = 2; i < n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }

    }
}
