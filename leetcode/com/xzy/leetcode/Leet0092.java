package com.xzy.leetcode;

import com.xzy.nowcoder.jianzhioffer.ListNode;

/**
 * @description: leetCode0092 反转链表二
 * @author: xzy
 * @date: 2022/12/5 17:24
 **/

/*给你单链表的头指针 head 和两个整数left 和 right ，其中left <= right 。
请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。

        示例 1：
        输入：head = [1,2,3,4,5], left = 2, right = 4
        输出：[1,4,3,2,5]
        示例 2：

        输入：head = [5], left = 1, right = 1
        输出：[5]

        提示：

        链表中节点数目为 n
        1 <= n <= 500
        -500 <= Node.val <= 500
        1 <= left <= right <= n

        进阶： 你可以使用一趟扫描完成反转吗？*/

public class Leet0092 {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode listNode = reverseBetween2(listNode1, 2, 4);
        System.out.println(listNode.val);
        while (listNode.next != null){
            System.out.println(listNode.next.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 虚拟头
        ListNode result = new ListNode(head.val);
        result.next = head;
        for (int i = 0; i < left; i++){
            head = head.next;
        }
        // 反转链节点前一个节点位置
        ListNode pre = head;
        head = head.next;
        for (int i = left; i < right; i++){
            // 反转链表

        }
        return result;
    }

    // 反转链表需要双指针，虚拟头
    public static ListNode reverseBetween2(ListNode head, int left, int right) {
        // 遍历依次反转 3个节点定位需要3个指针，从left前面的节点   已反转节点后的第一个结点   下一个节点 完成3个节点指针修改
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < left; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = left; i < right; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }

}
