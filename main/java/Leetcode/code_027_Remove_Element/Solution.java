package Leetcode.code_027_Remove_Element;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int nextEmpty=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[nextEmpty]=nums[i];
                nextEmpty++;
            }
        }
        return nextEmpty;
    }
}