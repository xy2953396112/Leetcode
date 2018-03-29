package Leetcode.code_173_Binary_Search_Tree_Iterator;


import java.util.Stack;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }




public class Solution {

    Stack<TreeNode> stack = new Stack<>();

    public Solution(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
          return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {

        TreeNode tn = stack.pop(); //返回栈顶最小的元素
        pushAll(tn.right);
        return tn.val;
    }

    public void pushAll(TreeNode treeNode){

        for(;treeNode!=null;stack.push(treeNode),treeNode=treeNode.left);


    }
}
