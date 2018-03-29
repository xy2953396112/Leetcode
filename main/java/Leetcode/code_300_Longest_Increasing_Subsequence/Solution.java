package Leetcode.code_300_Longest_Increasing_Subsequence;

public class Solution {
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int[] a = new int[nums.length];

        int max= 0;

        for(int i=0;i<nums.length;i++){   //对于i这个元素

            a[i] = 1;  //每个元素至少有一个上升的子序列，也就是自己

            for(int j=0;j<i;j++){    //依次遍历每个最长的上升子序列

                if(nums[i]>nums[j])
                    a[i] = Math.max((a[j]+1),a[i]); //  选出最长的上升子序列

            }

            max = Math.max(max,a[i]); //得到i下边的最大max,也是就是上升子序列
        }

         return max;
    }
}
