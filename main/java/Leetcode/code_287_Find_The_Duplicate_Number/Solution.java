package Leetcode.code_287_Find_The_Duplicate_Number;

public class Solution {

    public int findDuplicate(int[] nums) {

        int low = 1,high = nums.length-1;

        while(low < high){

            int count = 0;
            int mid = (low + high) /2;  //中位数
            for(int i =0;i<nums.length;i++){
                if(nums[i] <= mid)    //小于中位数的个数有多少个，如果小于mid,则重复数字在后边，大于则在中位数前边
                    count ++;
            }
            if(count > mid){
                high = mid;
            }else{
                low = mid+1;
            }

        }
        return low;
    }
}
