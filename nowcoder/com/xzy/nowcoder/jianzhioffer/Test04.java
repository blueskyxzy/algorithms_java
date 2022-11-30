package com.xzy.nowcoder.jianzhioffer;
// created by xzy on 2019-05-07

/*
        输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
        假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
        例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。;
*/

import java.util.HashMap;
import java.util.Map;

// 重构二叉树
public class Test04 {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
        // 中序遍历二叉树
        midPrintBinaryTree(treeNode);
    }

    private static void midPrintBinaryTree(TreeNode treeNode) {
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

    private static TreeNode constructprein(int[] pre, int[] in, int pstart, int pend, int istart, int iend, Map<Integer, Integer> inMap) {
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

    // Definition for binary tree;
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }



}
