package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-28
 *
 * 找出最底消费数组
 * 有单日，3日，7日和月票
 * 输入2个数组，第一个是售票的价格数组，第二个是游玩日期数组，大于1小于365
 **/

public class Test12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 方法一 动态规划，第一个日最便宜的fn,游玩日
         // dp[i]记录前i天的最少花费， cost[]是i天的单挑消耗，按断dp[i-3],dp[i-7],dp[i-30]对比花费哪个最小，最后返回dp最后游玩日
    }
}
