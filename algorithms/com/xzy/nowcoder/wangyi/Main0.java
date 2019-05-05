package com.xzy.nowcoder.wangyi;

import java.util.Scanner;

/**
 * Created by xzy on 19/1/2  .
 */

/*编程题] 回文序列
        时间限制：1秒

        空间限制：32768K

        如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
        {1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列,
        {1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
        现在给出一个数字序列，允许使用一种转换操作：
        选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
        现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。

        输入描述:
        输入为两行，第一行为序列长度n ( 1 ≤ n ≤ 50) 第二行为序列中的n个整数item[i] (1 ≤ iteam[i] ≤ 1000)，以空格分隔。

        输出描述:
        输出一个数，表示最少需要的转换次数

        输入例子1:
        4
        1 1 1 3

        输出例子1:
        2*/

public class Main0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int times = 0;
            int n = scanner.nextInt();
            int[] inputArr = new int[n];
            for (int i = 0; i < n; i++) {
                inputArr[i] = scanner.nextInt();
            }
            int head = 0;
            int tail = n - 1;
            while (head < tail) {
                if (inputArr[head] > inputArr[tail]) {
                    inputArr[--tail] += inputArr[tail + 1];
                    times++;
                } else if (inputArr[head] < inputArr[tail]) {
                    inputArr[++head] += inputArr[head - 1];
                    times++;
                } else {
                    head++;
                    tail--;
                }
            }
            System.out.println(times);
        }
        scanner.close();
    }

/*
    public static int transform(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int times = 0;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                if (arr[i] > arr[j]) {
                    arr[j - 1] += arr[j];
                    j--;
                    times++;
                } else {
                    arr[i + 1] += arr[i];
                    i++;
                    times++;
                }
            }
        }
        return times;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int loop = sc.nextInt();
            int[] arr = new int[loop];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(transform(arr));
        }
    }*/

}