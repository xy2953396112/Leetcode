package Leetcode.code_152_Maximum_Product_Subarray;

public class Solution {

    public int maxProduct(int[] nums) {

        if(nums == null || nums.length < 1){
            throw new IllegalArgumentException();
        }

        if(nums.length == 1)
            return nums[0];

        int result = nums[0];
        int fmax = nums[0];
        int fmin = nums[0];
        int prevMax;
        for(int i=1;i<nums.length;i++){
             prevMax = fmax;
             fmax =  Math.max(Math.max(nums[i]*prevMax,nums[i]),nums[i] * fmin);
             fmin =  Math.min(Math.min(nums[i]*prevMax,nums[i]),nums[i] * fmin);
             result = Math.max(result,fmax);

        }


        return result;
    }
}
