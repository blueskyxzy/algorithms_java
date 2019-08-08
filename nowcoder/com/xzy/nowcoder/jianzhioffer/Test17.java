package com.xzy.nowcoder.jianzhioffer;

/**
 * Created by xzy on 2019/8/1  .
 */

// 代码的鲁棒性	树的子结构
// 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class Test17 {

    public static void main(String[] args) {
        TreeNode treeNodeA = new TreeNode(2);
        TreeNode treeNodeA1 = new TreeNode(3);
        TreeNode treeNodeA2 = new TreeNode(6);
        TreeNode treeNodeA3 = new TreeNode(7);
        TreeNode treeNodeB = new TreeNode(6);
        TreeNode treeNodeB1 = new TreeNode(7);
        TreeNode treeNodeC = new TreeNode(5);
        TreeNode treeNodeC1 = new TreeNode(7);
        TreeNode treeNodeD = new TreeNode(3);
        treeNodeA.left = treeNodeA1;
        treeNodeA.right = treeNodeA2;
        treeNodeA2.right = treeNodeA3;
        treeNodeB.right = treeNodeB1;
        treeNodeC.right = treeNodeC1;
        boolean result = HasSubtree(treeNodeA, treeNodeB);
        System.out.println("返回：" + result);
        boolean result2 = HasSubtree(treeNodeA, treeNodeC);
        System.out.println("返回：" + result2);
        boolean result3 = HasSubtree(treeNodeA, treeNodeD);
        System.out.println("返回：" + result3);


//        {8,8,7,9,2,#,#,#,#,4,7},{8,9,2}
        TreeNode treeNodeE = new TreeNode(8);
        TreeNode treeNodeE1 = new TreeNode(8);
        TreeNode treeNodeE2 = new TreeNode(7);
        TreeNode treeNodeE3 = new TreeNode(9);
        TreeNode treeNodeE4 = new TreeNode(2);
        TreeNode treeNodeE5 = new TreeNode(4);
        TreeNode treeNodeE6 = new TreeNode(7);
        TreeNode treeNodeF = new TreeNode(8);
        TreeNode treeNodeF1 = new TreeNode(9);
        TreeNode treeNodeF2 = new TreeNode(2);
        treeNodeE.left = treeNodeE1;
        treeNodeE1.right = treeNodeE2;
        treeNodeE1.right = treeNodeE3;
        treeNodeE3.left = treeNodeE4;
        treeNodeE2.right = treeNodeE5;
        treeNodeE5.right = treeNodeE6;
        treeNodeF.right= treeNodeF1;
        treeNodeF1.left = treeNodeF2;

        boolean result4 = HasSubtree(treeNodeE, treeNodeF);
        System.out.println("返回：" + result4);

    }

    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        // 特殊情况
        if (root2 == null){
            return false;
        }
        if (root1 == null){
            return false;
        }
        // 遍历二叉树
        Boolean result = midSubBinaryTree(root1, root2);
        return result;
    }

    public static Boolean midSubBinaryTree(TreeNode treeNodeA, TreeNode treeNodeB) {
        while (treeNodeA != null){
            Boolean isSameBinaryTree = isSameBinaryTree(treeNodeA, treeNodeB);
            if (isSameBinaryTree){
                return true;
            } else {
                Boolean isLeftSame = isSameBinaryTree(treeNodeA.left, treeNodeB);
                Boolean isRightSame = isSameBinaryTree(treeNodeA.right, treeNodeB);
                if (isLeftSame || isRightSame){
                    return true;
                }
                Boolean leftChildSame = midSubBinaryTree(treeNodeA.left, treeNodeB);
                Boolean rightChildSame = midSubBinaryTree(treeNodeA.right, treeNodeB);
                if (leftChildSame || rightChildSame){
                    return true;
                } else{
                    return false;
                }
            }
        }
        return false;
    }

    // 判断两个二叉树是否一样
    public static Boolean isSameBinaryTree(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if ((A == null && B != null) || (A != null && B == null)) return false;
        if (A.val != B.val) return false;
        return isSameBinaryTree(A.left, B.left) && isSameBinaryTree(A.right, B.right);
    }

}
