package com.xzy.nowcoder.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xzy on 18/12/28  .
 */

//对字符串进行排序输出（10 分）
//        给定一个字符串，对该字符串进行排序，请输出排好序的字符串。要求能够连续输入输出的字符串。
//
//        输入格式:
//        在一行输入一个字符串
//
//        输出格式:
//        输出排好序的字符串的序列
//
//        输入样例:
//
//        fecbad
//
//        输出样例：
//
//        abcdef

public class program4 {

    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        // 输入一个连续的字符串
        String s1 = s.nextLine();
        char[] chars = s1.toCharArray();
        // 排序
        Arrays.sort(chars);
        String result = String.valueOf(chars);
        System.out.println(result);
    }
}
