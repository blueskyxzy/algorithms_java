package com.xzy.nowcoder.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xzy
 * @create: 2024-05-27
 *
 * 给定一个长度为 n 的整型数组，表示一个选手在 n 轮内可选择的牌面分数。选手基于规则
 * 选牌，请计算所有轮结束后其可以获得的最高总分数。选择规则如下：
 * 1、在每轮里选手可以选择获取该轮牌面，则其总分数加上该轮牌面分数，为其新的总分数。
 * 2、选手也可不选择本轮牌面直接跳到下一轮，此时将当前总分数还原为 3 轮前的总分数，
 * 若当前轮次小于等于 3（即在第 1、2、3 轮选择跳过轮次），则总分数置为 0。
 * 3、选手的初始总分数为 0，且必须依次参加每一轮。
 * 输入描述：
 * 第一行为一个小写逗号分割的字符串，表示 n 轮的牌面分数，1<= n <=20。
 * 分数值为整数，-100 <= 分数值 <= 100。
 *
 **/

public class Test04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String next = in.next();
        String[] strs = next.split(",");
        HashMap<Object, Object> map = new HashMap<>();

    }

}
