package com.CK;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node9 = new TreeNode(8);
//        TreeNode node10 = new TreeNode(9);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node13 = new TreeNode(9);
//        TreeNode node14 = new TreeNode(8);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
//        node4.left = node9;
//        node4.right = node10;
//        node6.left = node13;
//        node6.right = node14;

        root.printTree();
        Solution2 solution = new Solution2();
        System.out.println(solution.inorderTraversal(root).toString());
    }
}

class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res;
        if (root.left != null) inorderTraversal(root.left);
        res.add(root.val);
        if (root.right != null) inorderTraversal(root.right);
        return res;
    }
}

//Iterator
class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
