// Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

// Calling next() will return the next smallest number in the BST.

// Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.


//二叉搜索树或者是一棵空树，或者是具有下列性质的二叉树：
//        每个结点都有一个作为搜索依据的关键码(key)，所有结点的关键码互不相同。
//        左子树（如果非空）上所有结点的关键码都小于根结点的关键码。
//        右子树（如果非空）上所有结点的关键码都大于根结点的关键码。
//        左子树和右子树也是二叉搜索树。
//        结点左子树上所有关键码小于结点关键码；
//        右子树上所有关键码大于结点关键码；
//        若从根结点到某个叶结点有一条路径，路径左边的结点的关键码不一定小于路径上的结点的关键码。
//        如果对一棵二叉搜索树进行中序遍历，可以按从小到大的顺序，将各结点关键码排列起来，所以也称二叉搜索树为二叉排序树。
import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class BinarySearchTreeIterator {
    Stack<TreeNode> stack;

    public void BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();

        while(root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty() ? false : true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode nextSmallest = stack.pop();

        TreeNode addToStack = nextSmallest.right;

        while(addToStack != null) {
            stack.add(addToStack);
            addToStack = addToStack.left;
        }

        return nextSmallest.val;
    }

    public static void main(String[] args){
        BinarySearchTreeIterator bstIterator = new BinarySearchTreeIterator();
        TreeNode root = new TreeNode(45);
        TreeNode node1 = new TreeNode(23);
        TreeNode node2 = new TreeNode(32);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(75);
        TreeNode node6 = new TreeNode(66);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        bstIterator.BSTIterator(root);
        while (bstIterator.hasNext()) {
            int value = bstIterator.next();
            System.out.println(value);
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */