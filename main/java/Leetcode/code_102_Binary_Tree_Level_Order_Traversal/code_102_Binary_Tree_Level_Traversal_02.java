package Leetcode.code_102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class code_102_Binary_Tree_Level_Traversal_02 {

    public List<List<Integer>> levelOrder(TreeNode root) {

         List<List<Integer>> res = new ArrayList<List<Integer>>();
         if(root==null) return res;
         Queue<TreeNode> queue = new LinkedList<TreeNode>();//先进先出
        queue.add(root);
        while(!queue.isEmpty()){  //如果为空，条件为false,则表示下一层再没有节点

             List<Integer> level = new ArrayList<Integer>(); //每层的元素集合
             int count = queue.size();  //队列中元素的个数
             for(int i=0;i<count;i++){
                 TreeNode node = queue.poll();
                 level.add(node.val);
                 if(node.left != null){    //
                     queue.add(node.left);
                 }
                 if(node.right != null){
                     queue.add(node.right);
                 }

             }
             res.add(level); //每层的元素放入List<Integer>
         }

       return res;
    }
}
