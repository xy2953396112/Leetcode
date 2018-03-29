package Leetcode.code_110_Balanced_Binary_Tree;

public class Solution {

    public boolean isBalanced(TreeNode root) {

        if(root == null ){
            return false;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        if( left - right > 1 || right - left > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    int depth(TreeNode n){

        if(n == null ){
            return 0;
        }

        if( n.left == null && n.right == null ) {
            return 1;
        }else{
            int left = depth(n.left);
            int right = depth(n.right);
            return 1 + (left > right ? left : right );
        }
    }
}
