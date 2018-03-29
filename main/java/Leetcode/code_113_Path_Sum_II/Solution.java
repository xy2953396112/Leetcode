package Leetcode.code_113_Path_Sum_II;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {


    public List<List<Integer>> pathSum(TreeNode root, int sum){

         List<List<Integer>> result = new LinkedList<>();
         List<Integer> currentResult = new LinkedList<>();
         pathSum(root,sum,currentResult,result);

         return result;
    }

    public void pathSum(TreeNode root,int sum,List<Integer> currentResult,List<List<Integer>> result){

         if(root == null) return;
         currentResult.add(root.val);
         if(root.left == null && root.right ==null && sum==root.val){
                result.add(new LinkedList<>(currentResult));
                currentResult.remove(currentResult.size()-1); //回到上一层
                return;
         }else{
             pathSum(root.left,sum,currentResult,result);
             pathSum(root.right,sum,currentResult,result);
         }

        currentResult.remove(currentResult.size()-1);    //回到上一层
    }
}


