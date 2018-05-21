// Given a binary tree, return all root-to-leaf paths.

// For example, given the following binary tree:

//    1
//  /   \
// 2     3
//  \
//   5
// All root-to-leaf paths are:

// ["1->2->5", "1->3"]

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class BinaryTreePathsXzy {

//         1
//       /   \
//      2     3
//       \   / \
//        5  4  6
//
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        node3.left = node4;
        node3.right = node6;

        List<String> result = BinaryTreePaths(node1);
        System.out.println("所有路径有：");
        for (String str:result){
            System.out.println(str);
        }

    }

    private static List<String> BinaryTreePaths(TreeNode root) {
       List<String> result = new ArrayList<>();
       TreeNode tn = root;
       String str = new String();

       createPaths(result, tn, str);

       return result;
    }

    // 递归
    private static void createPaths(List<String> result, TreeNode tn, String str) {

        if (tn.left==null && tn.right==null){
            str = str + tn.val;
            result.add(str);
        }

        if (tn.left!=null){
            // FIXME 左右节点都有，则str拼接了2次tn.val。
//            str = str + tn.val + "->";
            createPaths(result, tn.left, str + tn.val + "->");
        }

        if (tn.right!=null){
//            str = str + tn.val + "->";
            createPaths(result, tn.right, str + tn.val + "->");
        }
    }

}
