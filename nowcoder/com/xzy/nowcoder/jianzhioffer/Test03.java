package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-06

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

//  输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
//	从尾到头打印链表
public class Test03 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ArrayList<Integer> integers = printListFromTailToHead(node1);
        for(Integer i:integers){
            System.out.println(i + ",");
        }

        ArrayList<Integer> result = printListFromTailToHead(null);

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
/*        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) return result;
        while(listNode.next != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        list.add(listNode.val);
        for (int i = list.size()-1; i >= 0; i--)
            result.add(list.get(i));
        return result;*/

        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }


    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


}
