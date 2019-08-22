package com.xzy.nowcoder.jianzhioffer;

/**
 * Created by xzy on 2019/8/8  .
 */

// 操作给定的二叉树，将其变换为源二叉树的镜像
// 面试思路	二叉树的镜像
//    二叉树的镜像定义：源二叉树
//            8
//            /  \
//            6   10
//            / \  / \
//            5  7 9 11
//            镜像二叉树
//            8
//            /  \
//            10   6
//            / \  / \
//            11 9 7  5
public class Test18 {

    public static void main(String[] args) {
        TreeNode treeNodeA1 = new TreeNode(8);
        TreeNode treeNodeA2 = new TreeNode(6);
        TreeNode treeNodeA3 = new TreeNode(10);
        TreeNode treeNodeA4 = new TreeNode(5);
        TreeNode treeNodeA5 = new TreeNode(7);
        TreeNode treeNodeA6 = new TreeNode(9);
        TreeNode treeNodeA7 = new TreeNode(11);
        treeNodeA1.left = treeNodeA2;
        treeNodeA1.right = treeNodeA3;
        treeNodeA2.left = treeNodeA4;
        treeNodeA2.right = treeNodeA5;
        treeNodeA3.left = treeNodeA6;
        treeNodeA3.right = treeNodeA7;
        Mirror(treeNodeA1);
        CodeUtils.midPrintBinaryTree(treeNodeA1);
    }

/*    public static void Mirror(TreeNode root) {
        if (root != null){
            TreeNode treeNode = new TreeNode(root.val);
            midMirror(root, treeNode);
//            root = treeNode;    // 自定义对象是引用传递，但是原来的内存地址的内存数据没有改变
            exchangeRootData(treeNode, root);
        } else {
            // null, 不处理
        }
    }

    private static void exchangeRootData(TreeNode treeNode, TreeNode root) {
        if(treeNode != null){
            if (root !=null){
                root.val = treeNode.val;
            } else {
                TreeNode treeNode1 = new TreeNode(treeNode.val);
                root = treeNode1;
            }
            exchangeRootData(treeNode.left, root.right);
            exchangeRootData(treeNode.right, root.left);
        } else {
            root = null;
        }
    }

    private static void midMirror(TreeNode root, TreeNode treeNode) {
        if (root != null){
            treeNode.val = root.val;
            if (root.left != null){
                TreeNode treeNodeLeft = new TreeNode(root.left.val);
                treeNode.right = treeNodeLeft;
            }
            if (root.right != null){
                TreeNode treeNodeRight= new TreeNode(root.right.val);
                treeNode.left = treeNodeRight;
            }
            midMirror(root.left, treeNode.right);
            midMirror(root.right, treeNode.left);
        }
    }*/

    // 网上的方式  左右交换
    public static void Mirror(TreeNode root) {
        TreeNode temp;
        if(root!=null)
        {
            temp=root.left;
            root.left=root.right;
            root.right=temp;
            if(root.left!=null)
                Mirror(root.left);
            if(root.right!=null)
                Mirror(root.right);
        }
    }
}
