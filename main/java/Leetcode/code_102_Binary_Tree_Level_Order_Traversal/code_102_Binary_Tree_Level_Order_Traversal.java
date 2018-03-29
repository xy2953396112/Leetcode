package Leetcode.code_102_Binary_Tree_Level_Order_Traversal;


import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class code_102_Binary_Tree_Level_Order_Traversal {

        public List<List<Integer>> levelOrder(TreeNode root) {

             List<List<Integer>> result = new ArrayList<List<Integer>>();
             if(root==null){
                 return result;
             }
             List<Integer> one = new ArrayList<Integer>();
             one.add(root.val);
             result.add(one);  //根节点的值
             List<List<Integer>> left = levelOrder(root.left); //左节点集合
             List<List<Integer>> right = levelOrder(root.right);//右节点集合
            for(int i=0;i<left.size() || i<right.size();i++){  //每一层的元素集合
                List<Integer> item = new ArrayList<Integer>();
                if(i<left.size()){
                    for(Integer k:left.get(i)){
                        item.add(k);
                    }
                }
                if(i<right.size()){
                    for(Integer k:right.get(i)){
                        item.add(k);
                    }
                }
                result.add(item);
            }

          return result;
         }

}
