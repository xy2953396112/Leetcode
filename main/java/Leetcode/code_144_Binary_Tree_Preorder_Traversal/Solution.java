package Leetcode.code_144_Binary_Tree_Preorder_Traversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

       List<Integer> result = new LinkedList<>();

       if(root != null ){

           Deque<TreeNode> stack = new LinkedList<>();
           stack.add(root);

           while(!stack.isEmpty()){

               TreeNode node = stack.remove();
               result.add(node.val);
               if(node.right!=null){
                   stack.add(node.right);
               }
               if(node.left!=null){
                   stack.add(node.left);
               }




           }




       }


        return result;

    }

}
