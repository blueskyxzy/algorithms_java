package com.xzy.nowcoder.huawei;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xzy
 * @create: 2024-05-26
 * 2.
 * 明明的随机数
 * 明明生成了
 * 𝑁
 * N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 *
 * 数据范围：
 * 1
 * ≤
 * 𝑛
 * ≤
 * 1000
 *
 * 1≤n≤1000  ，输入的数字大小满足
 * 1
 * ≤
 * 𝑣
 * 𝑎
 * 𝑙
 * ≤
 * 500
 *
 * 1≤val≤500
 * 时间限制：C/C++ 1秒，其他语言2秒
 * 空间限制：C/C++ 32M，其他语言64M
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。
 * 接下来的 N 行每行输入一个整数，代表明明生成的随机数。
 * 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 *
 * 示例1
 * 输入例子：
 * 3
 * 2
 * 2
 * 1
 * 输出例子：
 * 1
 * 2
 * 例子说明：
 * 输入解释：
 * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
 * 2
 * 2
 * 1
 * 所以样例的输出为：
 * 1
 * 2
 **/

public class Test02 {

    //去重并排序
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            list.add(a);
        }
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(result);
        for (Integer x: result){
            System.out.println(x);
        }
//        // map去重复
//        Map<Integer, Integer> map = new HashMap(n);
//        for (int i = 0; i < n; i++){
//            int a = in.nextInt();
//            map.put(a, 1);
//        }
//        // 排序
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        List<Integer> result = entries.stream().map(entry -> entry.getKey()).collect(Collectors.toList());

    }
}
