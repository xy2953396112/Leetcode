package Leetcode.code_235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null && p == null && q == null) return null;

        if(Math.max(p.val,q.val) < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(Math.min(p.val,q.val) > root.val){
             return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }

}
