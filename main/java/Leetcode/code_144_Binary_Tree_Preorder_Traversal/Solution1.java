package Leetcode.code_144_Binary_Tree_Preorder_Traversal;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    List<Integer> result ;

    public List<Integer> preorderTraversal(TreeNode root) {
        result = new LinkedList<>();
        preOrder(root);
        return result;
    }

    public void preOrder(TreeNode root){

        if(root != null){
            result.add(root.val);
            preOrder(root.left);
            preOrder(root.right);

        }

    }

}
