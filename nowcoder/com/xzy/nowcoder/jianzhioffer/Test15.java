package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-06-26


import java.util.ArrayList;
import java.util.List;


// 输入一个链表，反转链表后，输出新链表的表头。
// 代码的鲁棒性
// 反转链表
public class Test15 {

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
        ListNode listNode = ReverseList(node1);
        if (listNode != null){
            System.out.println(listNode.val);
        }
        while (listNode.next != null){
            listNode = listNode.next;
            System.out.println(listNode.val);
        }


    }

    // 思路比网上多个容器存，空间复杂度大些
    public static ListNode ReverseList(ListNode head) {
        ListNode result = null;
        if (head == null) {
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();
        ListNode temp;
        while (head != null) {
            temp = head;
            temp.next = null;
            listNodes.add(temp);
            head = head.next;
        }
        ListNode current;
        result = listNodes.get(0);
        for (ListNode listNode : listNodes) {
            result.next = listNode;
        }

        return result;

/*    // 网上递归方法
    // 如果链表为空或者链表中只有一个元素
        if(head == null || head.next == null)
            return head;

        //先反转后面的链表，走到链表的末端结点
        ListNode pReverseNode=ReverseList(head.next);

        //再将当前节点设置为后面节点的后续节点
        head.next.next=head;
        head.next = null;

        return pReverseNode;

    */


 /*   // 网上方法 多变量控制反转
    public static ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode reversedHead=null;
        ListNode current=head;
        ListNode tmp=null;
        ListNode pre=null;
        while(current!=null){
            tmp=current.next;
            current.next=pre;
            if(tmp==null)
                reversedHead=current;
            pre=current;
            current=tmp;

        }
        return reversedHead;
    }*/

        //   1 2  3  4 5  ->  1  2
        //
        //

    }
}
