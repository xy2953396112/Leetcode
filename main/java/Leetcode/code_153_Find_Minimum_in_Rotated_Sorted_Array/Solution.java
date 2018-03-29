package Leetcode.code_153_Find_Minimum_in_Rotated_Sorted_Array;

public class Solution {

    public int findMin(int[] nums) {

        // 参数检验
        if (nums == null || nums.length < 0) {
            throw new IllegalArgumentException();
        }

        return binarySearch(nums, 0, nums.length - 1);


    }

    public int binarySearch(int[] nums, int start, int end) {

        int mid = 0;

        while(start < end ){

            mid = start + ((end - start ) >>1 );

            if(nums[mid] > nums[mid+1]){

                return nums[mid+1];
            }
            else if(nums[mid] > nums[start]){
                start = mid;
            }
            // 说明中间值在第二个有序的数组中
            else {
                end = mid;
            }
        }

       return nums[0];
    }
}
