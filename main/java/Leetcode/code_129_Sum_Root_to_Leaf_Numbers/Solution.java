package Leetcode.code_129_Sum_Root_to_Leaf_Numbers;

import apple.laf.JRSUIUtils;

public class Solution {

    private int result = 0; // 记录总的结果
    private int num = 0; // 记根到叶子的数字

    public int sumNumbers(TreeNode root) {
        sum(root);
        return result;
    }

    public void sum(TreeNode root){

        if(root!=null){

            num = num*10+root.val;

            if(root.left==null && root.right==null){
                 result += num;

            }
            sum(root.left);
            sum(root.right);
            num /= 10;


        }

    }

}