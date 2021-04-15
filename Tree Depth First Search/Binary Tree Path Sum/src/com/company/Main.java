package com.company;

public class Main {



    public static boolean hasPath(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.val == sum || hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val))
            return true;

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path: " + hasPath(root, 23));
        System.out.println("Tree has path: " + hasPath(root, 16));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};