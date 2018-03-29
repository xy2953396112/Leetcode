package Leetcode.code_217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

       if(nums.length>1&&nums!=null){
           Set set = new HashSet(nums.length);
           for(int i=0;i<nums.length;i++){

               if(set.contains(nums[i])){
                   return true;
               }else{
                   set.add(nums[i]);
               }
           }

       }
        return false;
    }
}