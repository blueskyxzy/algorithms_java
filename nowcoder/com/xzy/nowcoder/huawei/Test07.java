package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-28
 *
 * 输入压缩后的报文。输出解压的报文
 * 压缩规则：数字后面是字母，数字是个数，可嵌套
 * 3【k]2[mn] 对应kkkmnmn
 * 3[m2[c]] 对应mccmccmcc
 **/

public class Test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 方法一识别到[ 进入方法 ，]退出嵌套，递归，识别到数字，记录记录个数并调用多次子方法，子方法输出【】内的字符串

        //方法二 LinkedList记录字符位置和次数,最终字符， 栈来完成
    }
}
