package Leetcode.code_257_Binary_Tree_Paths;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<String> binaryTreePaths(TreeNode root){

        List<String> result = new ArrayList<>();
        if(root != null){
            searchBT(root,"",result);

        }
        return result;
    }

    public void searchBT(TreeNode root,String path,List<String> result){
        if(root.left==null && root.right==null)  result.add(path+root.val);

        if(root.left!=null) searchBT(root.left,path+root.val+"->",result);

        if(root.right!=null) searchBT(root.right,path+root.val+"->",result);

    }
}
