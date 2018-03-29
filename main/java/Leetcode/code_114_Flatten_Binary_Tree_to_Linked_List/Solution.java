package Leetcode.code_114_Flatten_Binary_Tree_to_Linked_List;

public class Solution {

    public void flatten(TreeNode root) {

        if (root == null) return;
        if (root.left != null) {
            TreeNode cur = root.left;
            while (cur.right != null) {
                cur = cur.right;
            }
            cur.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
}
