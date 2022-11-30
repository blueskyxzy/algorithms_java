package com.xzy.nowcoder.wangyi;

import java.util.Scanner;

// 网易编程题
//[编程题] 优雅的点
//        时间限制：1秒
//
//        空间限制：32768K
//
//        小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
//        例如：半径的平方如果为25
//        优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
//
//        输入描述:
//        输入为一个整数，即为圆半径的平方,范围在32位int范围内。
//
//        输出描述:
//        输出为一个整数，即为优雅的点的个数
//
//        输入例子1:
//        25
//
//        输出例子1:
//        12

public class Main1 {

/*        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int x = Integer.parseInt(str);
        long startTime = System.nanoTime();
        int y = calcuatePoint(x);
        System.out.println(y);
        long endTime = System.nanoTime();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ns");
    }

    public static int calcuatePoint(int x){
        int a = (int) Math.sqrt(x);
        int count = 0;
        for (int i = -a; i <= a; i++){
            for (int j = -a; j <= a; j++){
                if (Math.pow(i, 2) + Math.pow(j, 2) == x){
                    count++;
                }
            }
        }
        return count;
    }*/


/*    解答一
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(count(n));
    }

    public static int count(int n) {
        int count = 0;
        double r = Math.sqrt(n);
        for (int i = 0; i < r; i++) {
            double j = Math.sqrt(n - i * i);
            if (Math.abs(j - Math.round(j)) <= 0.000000001) {
                count++;
            }
        }
        return 4 * count;
    }*/

//    解答2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rSquare = in.nextInt();
        int count = 0;
        double r = Math.sqrt(rSquare);

        //存储值
        for (int i = 0; i < r; i++) {
            /*运行超时
            for(int j=1;j<r+1;j++){
                if(i*i+j*j==rSquare){
                    count++;
                }
            }
            */
//优化点1
            double j = Math.sqrt(rSquare - i * i);
            if ((int) j == j) {
                count++;
            }
        }

        //优化点2
        System.out.print(count << 2);

    }

}
