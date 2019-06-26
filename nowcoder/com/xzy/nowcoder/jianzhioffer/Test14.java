package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-06-25

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 输入一个链表，输出该链表中倒数第k个结点。
// 代码的鲁棒性
// 链表中倒数第k个结点
public class Test14 {

    public static void main(String[] args) {
        System.out.println("请输入k:");
        Scanner s = new Scanner(System.in);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        while (s.hasNext()) {
            int i = s.nextInt();
            ListNode listNode = FindKthToTail(node1, i);
            if (listNode != null){
                System.out.println(listNode.val);
            }

        }

    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null){
            return null;
        }

        if (k<=0){
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head);
        while (head.next != null){
            listNodes.add(head.next);
            head = head.next;
        }
        int size = listNodes.size();
        return size - k >= 0?listNodes.get(size - k):null;
    }
}

