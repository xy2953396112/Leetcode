package Leetcode.code_094_Binary_Tree_Inorder_Traversal;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<Integer> result;

    public List<Integer> inorderTraversal(TreeNode root) {
        result = new LinkedList<>();
        inOrder(root);
        return result;
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            result.add(root.val);
            inOrder(root.right);
        }
    }
}