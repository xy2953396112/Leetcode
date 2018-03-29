package Leetcode.code_167_Two_Sum_II;

public class Solution {

    public int[] twoSum(int[] num, int target) {

        int[] result = new int[2];

        int left=0,right=result.length-1;
        while(left < right ){
            int val = num[left] + num[right];
            if(val == target){
                result[0] = left +1;
                result[1] = right -1 ;
            }else if( val > target){
                right --;
            }else{
                left ++;
            }
        }

        return result;

    }
}
