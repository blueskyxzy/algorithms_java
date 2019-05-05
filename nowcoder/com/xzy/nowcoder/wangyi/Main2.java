package com.xzy.nowcoder.wangyi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xzy on 19/1/2  .
 */

/*
 网易编程题
 编程题] 跳石板
        时间限制：1秒

        空间限制：32768K

        小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3.......
        这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的 石板，小易单次只能往前跳K的一个约数(不含1和K)步，即跳到K+X(X为K的一个非1和本身的约数)的位置。 小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，小易想知道最少需要跳跃几次可以到达。
        例如：
        N = 4，M = 24：
        4->6->8->12->18->24
        于是小易最少需要跳跃5次，就可以从4号石板跳到24号石板

        输入描述:
        输入为一行，有两个整数N，M，以空格隔开。 (4 ≤ N ≤ 100000) (N ≤ M ≤ 100000)

        输出描述:
        输出小易最少需要跳跃的步数,如果不能到达输出-1

        输入例子1:
        4 24

        输出例子1:
        5
*/

public class Main2 {

/*    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        long startTime = System.nanoTime();
        int count = function2(x, y);
        System.out.println("结果是：" + count);
        long endTime = System.nanoTime();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ns");
    }

    private static int function2(int x, int y) {
        List<Integer> list = function1(x);
        int count = 0;
        for (Integer xx :list){
            if (x+xx > y){
                continue;
            }
            if (x+xx == y) {
                count = 1;
                return count;

            }
            if (x + xx < y){
                count = function2(x+xx, y);
                count ++;
            }
        }
        return count;
    }

    private static List<Integer> function1(int x) {
        List<Integer> xx = new ArrayList<>();
        for (int i = 2; i< x; i++){
            if (x % i == 0){
                xx.add(i);
            }
        }
        return xx;
    }*/



/*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(leastJumpTime(n, m));
        }
    }


    // 思想：动态规划
    public static int leastJumpTime(int n, int m) {
        if (m == n) {
            return 0;
        }
        int steps = m - n + 1;// 算上了起点和终点
        int[] dp = new int[steps];// 规划的量：到达 每个位置需要的最小步数
        dp[0] = 0; // 起点
        for (int i = 1; i < steps; i++) {
            dp[i] = Integer.MAX_VALUE; // 初始化 表示后续位置都不能到达
        }
        for (int i = 0; i < steps; i++) {
            // 0对应n石板 ；steps - 1 = m-n对应m石板
            if (dp[i] == Integer.MAX_VALUE) { // 该位置不能像前走
                dp[i] = 0;
                continue;
            }
            ArrayList<Integer> list = getAppNums(i + n); // i+n才是石板号
            for (int j = 0; j < list.size(); j++) {
                int x = list.get(j);
                if (i + n + x <= m) {
                    dp[i + x] = Math.min(dp[i + x], dp[i] + 1);
                }
            }
        }
        if (dp[steps - 1] == 0) {
            return -1;
        } else {
            return dp[steps - 1];
        }
    }

    // 求因数 时间复杂度较低
    public static ArrayList<Integer> getAppNums(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
*/


/*
    采用动态规划思想求解。创建一个容器steps，steps[i]表示到达i号石板所需的最小步数。初始化为steps容器为INT_MAX。从序号N的石板开始逐个遍历，若steps[i]为INT_MAX，表示该点不可到达，直接开始下次循环。若steps[i]不为INT_MAX，表示该点可以到达，下面求解编号i的约数，进行动态规划。动态规划的转移方程为

    steps[i+j] = min(steps[i]+1,steps[i+j])   //i为石板编号，j为i的约束
    steps[N] = 0
*/

    public static int deal(int m, int n) {//m到n
        int mark[] = new int[n + 1];//记录到达每一个位置的步数
        for (int i = m + 1; i <= n; i++) {                          //初始化
            mark[i] = Integer.MAX_VALUE;
        }
        for (int i = m; i < n - 1; i++) {                         //填mark[]
            if (mark[i] == Integer.MAX_VALUE) continue; //如果当前起始位置本身不可达 不作处理
            ArrayList<Integer> list = allFactor(i);   //获得当前位置i的所有因子
            for (int j = 0; j < list.size(); j++) {         //计算i能到达的每一个位置tmp
                int tmp = i + list.get(j);
                int count = mark[i] + 1;
                if (tmp <= n && mark[tmp] > count) {        //如果从i到达位置tmp的次数比以前记录的小 更新mark[tmp]
                    mark[tmp] = count;
                }
            }
        }
        return mark[n];
    }

    public static ArrayList<Integer> allFactor(int n) {//获得n的所有因子 除1 n外
        ArrayList list = new ArrayList();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) list.add(n / i);
            }
        }
        return list;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = deal(m, n);
        if (r == Integer.MAX_VALUE) r = -1;
        System.out.println(r);
    }
}


//   4  8     2
//   8  12    1
//   4  24    5