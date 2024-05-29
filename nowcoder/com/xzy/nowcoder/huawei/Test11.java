package com.xzy.nowcoder.huawei;

import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-28
 *
 * TAL格式报文通信，生成匹配列表
 * 输入字符串，字符串使用16进制， 前2字符代表tag值，下面2个字符代表字节数如04，接下来8个字符就是4字节的value
 * 第二行输入要匹配的tag数量n
 * 后面n行是要匹配的n个tag十进制，递增排序
 *
 * 输出n个tag对应的n行匹配结果，每一行由长度和偏移量组成
 *
 **/

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //方法一  Map<Integer, Integer[]> 保存每个tag以及对应的偏移量即可， tag解析就是对应的第2字节， 用map的contain函数判断是否有

    }

}
