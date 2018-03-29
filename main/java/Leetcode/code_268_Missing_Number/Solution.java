package Leetcode.code_268_Missing_Number;

public class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int res = nums.length;
        
        for (int i = 0; i < nums.length; i++) res ^= (i ^ nums[i]);
        
        return res;
    }
}