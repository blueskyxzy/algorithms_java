package com.xzy.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 2019/8/26  .
 */

// 举例让抽象具体化	包含min函数的栈

//    定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
public class Test20 {

    public static void main(String[] args) {
//        ["PSH3","MIN","PSH4","MIN","PSH2","MIN","PSH3","MIN","POP","MIN","POP","MIN","POP","MIN","PSH0","MIN"]
//        对应输出应该为: 3,3,2,2,2,3,3,0
        push(3);
        int min1 = min();
        System.out.println(min1);
        push(4);
        int min2 = min();
        System.out.println(min2);
        push(2);
        int min3 = min();
        System.out.println(min3);
        push(3);
        int min4 = min();
        System.out.println(min4);
        pop();
        int min5 = min();
        System.out.println(min5);
        pop();
        int min6 = min();
        System.out.println(min6);
        pop();
        int min7 = min();
        System.out.println(min7);
        push(0);
        int min8 = min();
        System.out.println(min8);
    }

/*    static int[] stacks; // 数组结果存栈数据

    static int size = 0;

    static int min = Integer.MAX_VALUE;

    public static void push(int node) {
        stacks[size] = node;
        size ++;
        if (node < min){
            min = node;
        }
    }

    public static void pop() {
        size --;
        // 这里没法弄了，最小的值出栈了找不到次最小的替代，除非每次都遍历一下，遍历的时间复杂度就是O（n)了，不满足题目O（1）的要求
    }

    public static int top() {
        return stacks[size - 1];
    }

    public static int min() {
        return min;
    }*/

    static List<Integer> list = new ArrayList<>(); // 栈数据

    static List<Integer> minList = new ArrayList<>(); // 用于出栈时取次最小

    static int min = Integer.MAX_VALUE;

    static int size = 0;

    public static void push(int node) {
        list.add(node);
        size ++;
        if (minList.size() == 0){
            minList.add(node);
            min = node;
        } else {
            if (node <= min){
                minList.add(node);
                min = node;
            }
        }
    }

    public static void pop() {
        int top = top();
        if (top == min){
            if (minList.size() > 1){
                minList.remove(minList.size() - 1);
                min = minList.get(minList.size() - 1);
            } else {
                min = Integer.MAX_VALUE;
            }
        }
        list.remove(size - 1);
        size --;
    }

    public static int top() {
       return list.get(size - 1);
    }

    // 为了解决出栈后，最小值改变的问题，增加了最小值栈容器，存放递减的最小值。
    // 如果次最最小是在最小存放后入栈的，不会保存到最小值栈。这样没关系，因为这个次最小肯定是在 最小值之前出栈
    public static int min() {
        return min;
    }
}
