package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-09

import java.util.Stack;

// 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
// 两个栈来实现一个队列
public class Test05 {

    public static void main(String[] args) {
        Test05 queue = new Test05();
        // ["PSH1","PSH2","PSH3","POP","POP","PSH4","POP","PSH5","POP","POP"] 正确输出是 1   2   3    4    5
        queue.push(1);
        queue.push(2);
        queue.push(3);
        int pop1 = queue.pop();
        System.out.println(pop1);
        int pop2 = queue.pop();
        System.out.println(pop2);
        queue.push(4);
        int pop3 = queue.pop();
        System.out.println(pop3);
        queue.push(5);
        int pop4 = queue.pop();
        System.out.println(pop4);
        int pop5 = queue.pop();
        System.out.println(pop5);
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        Integer result = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return result;
    }
}
