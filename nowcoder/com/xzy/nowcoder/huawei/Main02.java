package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-29
 *
 * 4
 * 100 200 300 500
 * 1 2
 * 1 3
 * 2 4
 *
 **/

// 注意类名必须为 Main, 不要有任何 package xxx 信息

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.valueOf(in.nextLine());
        int[] nums = new int[a];
        String line = in.nextLine();
        String[] str = line.split(" ");
        for(int i = 0; i < a; i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        int[] sums = getSums(a, in, nums);
        int res = getMax(sums);
        System.out.println(res);
    }

    private static int[] getSums(int a, Scanner in, int[] nums) {
        int[] sums = new int[a];
        for(int i=0; i <= a-2; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if (sums[x-1] == 0){
                sums[x-1] += nums[y-1] + nums[x-1];
            } else {
                sums[x-1] += nums[y-1];
            }
        }
        return sums;
    }

    private static int getMax(int[] sums) {
        int max = 0;
        for(int s:sums){
            max = Math.max(max, s);
        }
        return max;
    }


}
