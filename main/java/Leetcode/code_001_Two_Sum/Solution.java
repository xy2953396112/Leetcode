package Leetcode.code_001_Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer index=map.get(target-nums[i]);
            if(index==null){
                map.put(nums[i],i);
            }else{
                return new int[]{i,index};
            }
        }
        return new int[]{0,0};
    }
}