package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-06-24

import java.util.Scanner;

// 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
// 二进制中1的个数
public class Test11 {
    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            int i = s.nextInt();
            int result = NumberOf1(i);
            System.out.println(result);
        }
    }

    // 方法1:采用Integer的toBinaryString
/*    public static int NumberOf1(int n) {
        int t=0;
        char[]ch=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                t++;
            }
        }
        return t;
    }*/

    // 方法二: n & (n - 1)
    public static int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
