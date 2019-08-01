package com.xzy.nowcoder.jianzhioffer;

import java.util.List;

/**
 * Created by xzy on 2019/8/1  .
 */

public class CodeUtils {

    /**
     * 遍历一个链表
     */
    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }


    //list转换成链表
    public static ListNode listToListNode(List<ListNode> listNodes) {
        ListNode root = listNodes.get(0);
        ListNode other = root;
        int size = listNodes.size();
        for (int i = 1; i < size; i++) {
            ListNode temp = listNodes.get(i);
            other.next = temp;
            other = temp;
        }
        return root;
    }

    //数组转换成链表
    public static ListNode arrayToListNode(int[] s) {
        ListNode root = new ListNode(s[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int i = 1; i < s.length; i++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(s[i]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;
    }
}
