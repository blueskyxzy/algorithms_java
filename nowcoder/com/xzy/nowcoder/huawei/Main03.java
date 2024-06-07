package com.exam;

import java.util.*;

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
 *  用遍历很简历，但是滑动窗口时间复杂度高
 *  问题：
 *  滑动窗口没考虑到-1和边缘等问题
 **/

// 注意类名必须为 Main, 不要有任何 package xxx 信息

public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int maxSubLine = getMaxSubLine(str);
        System.out.println(maxSubLine);
    }

    private static int getMaxSubLine(String str) {
        // 滑动窗口法解决最小子串
        int len = str.length();
        int max = 0;
        int left = 0;
        int right = 1;
        while(right < len){
            String sub = str.substring(left, right);
            if (rightCondition(sub)){
                // 小于等于1
                right ++;
            } else {
                left ++;
                // 判断是否只有一个字母并更新max
                sub = str.substring(left, right);
                if (getResult(sub) == 1){
                    max = Math.max(max, right - left - 1);
                }
            }
            // 判断是否只有一个字母并更新max
            if (getResult(sub) == 1){
                max = Math.max(max, right - left - 1);
            }
        }
        return max;
    }

    private static int getResult(String sub) {
        int count = 0;
        for (int i=0; i < sub.length();i++){
            char c = sub.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                count ++;
            }
        }
        return count;
    }


    private static boolean rightCondition(String sub) {
        // 是否不大于一个字母
        int count = getResult(sub);
        if (count > 1){
            return false;
        } else {
            return true;
        }

    }

}
