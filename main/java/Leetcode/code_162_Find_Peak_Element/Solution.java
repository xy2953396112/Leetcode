package Leetcode.code_162_Find_Peak_Element;

public class Solution {

    public int findPeakElement(int[] nums) {
          int left=0,right=nums.length-1;
          int mid =0;
          while(left<right){

              mid = (left+right)/2;
              if(nums[mid] < nums[mid+1]) left = mid + 1;
              else right = mid;
          }
          return left;

    }
}
