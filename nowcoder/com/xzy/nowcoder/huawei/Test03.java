package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-26
 * 3.
 * 进制转换
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 *
 * 数据范围：保证结果在
 * 1
 * ≤
 * 𝑛
 * ≤
 * 2
 * 31
 * −
 * 1
 *
 * 1≤n≤2
 * 31
 *  −1
 * 时间限制：C/C++ 1秒，其他语言2秒
 * 空间限制：C/C++ 32M，其他语言64M
 * 输入描述：
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 * 示例1
 * 输入例子：
 * 0xAA
 * 输出例子：
 * 170
 **/

public class Test03 {
    public static void main(String[] args) {
        int[] num = {10, 11, 12, 13, 14, 15, 16};
        Scanner in = new Scanner(System.in);
        String next = in.next();
        String str = next.substring(2);
//        int r = Integer.parseInt(str, 16);
//        System.out.println(r);
        int res = 0;
        int len = str.length();
        for (int i = len - 1; i >= 0 ; i--) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'F') {
                res += num[str.charAt(i) - 'A'] * Math.pow(16, len -  i - 1);
            } else {
                res += Integer.valueOf(str.charAt(i) - '0') * Math.pow(16, len - i - 1);
            }
        }
        System.out.println(res);
//        String[] map={"0"，"1"，"2"，"3"，"4"，"5"，"6"，"7"，"8"，"9"，"a"，"b"，"c"，"d"，"e"，"f"};
//        while（n!=0）{
//            result = map[n&15]+result;
//            n>>=4;
//        }

    }
}
