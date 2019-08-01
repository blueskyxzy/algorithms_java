package com.xzy.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 2019/8/1  .
 */

// 代码的鲁棒性	合并两个排序的链表
// 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Test16 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;
        ListNode merge = Merge(node1, node4); // 合并
        CodeUtils.printListNode(merge); // 遍历输出链表

        ListNode node7 = null;
        ListNode node8 = null;
        ListNode merge2 = Merge(node7, node8); // 合并
        CodeUtils.printListNode(merge2); // 遍历输出链表

    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        // 两个递增数组可以用归并排序，链表同理
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        List<ListNode> listNodes = new ArrayList<>();
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                ListNode listNode = new ListNode(list1.val);
                listNodes.add(listNode);
                list1 = list1.next;
            } else {
                ListNode listNode = new ListNode(list2.val);
                listNodes.add(listNode);
                list2 = list2.next;
            }
        }
        while (list1 != null){
            ListNode listNode = new ListNode(list1.val);
            listNodes.add(listNode);
            list1 = list1.next;
        }
        while(list2 != null){
            ListNode listNode = new ListNode(list2.val);
            listNodes.add(listNode);
            list2 = list2.next;
        }
//        ListNode result = CodeUtils.listToListNode(listNodes);
        ListNode result = listNodes.get(0);
        ListNode other = result;
        int size = listNodes.size();
        for (int i = 1; i < size; i++) {
            ListNode temp = listNodes.get(i);
            other.next = temp;
            other = temp;
        }
        return result;
    }

}
