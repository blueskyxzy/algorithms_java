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
        printListNode(listNode);
    }

    // 思路比网上多个容器存，空间复杂度大些
    public static ListNode ReverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        List<ListNode> listNodes = new ArrayList<>();
        ListNode temp = null;
        ListNode nex = null;
        ListNode current = head;
        while (current != null) {
            temp = current;
            nex = current.next;
            temp.next = null;
            listNodes.add(temp);
            current = nex;  // 引用会修改对象值和next指向，不会修改next对象
        }

        int size = listNodes.size();
        ListNode root = listNodes.get(size - 1);
        ListNode other = root;
        for (int i = size - 2; i >= 0; i--) {
            ListNode tmp = listNodes.get(i);
            other.next = tmp;
            other = tmp;
        }
        return root;

    }

/*    // 网上递归方法
    // 如果链表为空或者链表中只有一个元素
        if(head == null || head.next == null)
            return head;

        //先反转后面的链表，走到链表的末端结点
        ListNode pReverseNode=ReverseList(head.next);

        //再将当前节点设置为后面节点的后续节点
        head.next.next=head;
        head.next = null;

        return pReverseNode;*/


/*
    // 网上方法 多变量控制反转
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

    /**
     * 遍历一个链表
     */
    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

}
