package com.xzy.nowcoder.jianzhioffer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static void midPrintBinaryTree(TreeNode treeNode) {
        if (treeNode != null) {
            midPrintBinaryTree(treeNode.left);
            System.out.println(treeNode.val);
            midPrintBinaryTree(treeNode.right);
        }
    }

    // 由先序遍历和中序遍历，构建二叉树
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        // 构建inMap方便查询中序遍历索引,前提是没有重复数字
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            inMap.put(in[i], i);
        }
        return constructprein(pre, in, 0, pre.length - 1, 0, in.length - 1, inMap);
    }

    public static TreeNode constructprein(int[] pre, int[] in, int pstart, int pend, int istart, int iend, Map<Integer, Integer> inMap) {
        if (pend >= pstart) {
            int rootValue = pre[pstart];
            TreeNode rootNode = new TreeNode(rootValue);
            Integer index = inMap.get(rootValue);
            // pstart + index - istart =  pstart + 1 + (index-1 - istart)
            TreeNode leftNode = constructprein(pre, in, pstart + 1, pstart + index - istart, istart, index - 1, inMap);
            // pstart + index - is tart + 1 = 左边基础上+1（pstart + index - istart） + 1  不能index +1
            TreeNode rightNode = constructprein(pre, in, pstart + index - istart + 1, pend, index + 1, iend, inMap);
            rootNode.left = leftNode;
            rootNode.right = rightNode;
            return rootNode;
        } else {
            return null;
        }
    }

    // 判断两个二叉树是否一样
    public static Boolean isSameBinaryTree(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if ((A == null && B != null) || (A != null && B == null)) return false;
        if (A.val != B.val) return false;
        return isSameBinaryTree(A.left, B.left) && isSameBinaryTree(A.right, B.right);
    }

}
