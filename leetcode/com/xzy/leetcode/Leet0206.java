package com.xzy.leetcode;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.xzy.nowcoder.jianzhioffer.CodeUtils;
import com.xzy.nowcoder.jianzhioffer.ListNode;

/**
 * @author: xzy
 * @create: 2024-03-20
 **/

/*反转链表
        输入：head = [1,2,3,4,5]
        输出：[5,4,3,2,1]

        */

public class Leet0206 {

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
//        ListNode listNode = reverseList(node1);
        ListNode listNode = reverseBetween(node1, 2, 4);
        CodeUtils.printListNode(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode current = head;
        while(current != null){
            ListNode tmp = current.next;
            current.next = pre;
            pre = current;
            current = tmp;
        }
        return pre;
    }

    //    leetcode 92 反转链表部分
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 因为头节点有可能发生变化，使用虚拟头节点可以避免复杂的分类讨论
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        // 第 1 步：从虚拟头节点走 left - 1 步，来到 left 节点的前一个节点
        // 建议写在 for 循环里，语义清晰
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 第 2 步：从 pre 再走 right - left + 1 步，来到 right 节点
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        // 第 3 步：切断出一个子链表（截取链表）
        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        // 注意：切断链接
        pre.next = null;
        rightNode.next = null;

        // 第 4 步：同第 206 题，反转链表的子区间
        reverseList(leftNode);

        // 第 5 步：接回到原来的链表中
        pre.next = rightNode;
        leftNode.next = curr;
        return dummyNode.next;
    }

}
