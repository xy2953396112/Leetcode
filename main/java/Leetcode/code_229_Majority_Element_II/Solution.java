package Leetcode.code_229_Majority_Element_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> majorityElement(int[] nums){

        List<Integer> res = new ArrayList<>();

        if(nums.length == 0){
            return res;

        }
        int num1 = nums[0],num2 = nums[0],count1=1,count2=0;

        for(int num : nums){

            if(count1== num){
                count1++;
            }else if(count2 == num){

                count2++;
            }else if (count1==0){
                num1 = num;
                count1++;
            }else if(count2 == 0){
                num2 = num;
                count2++;
            }else{
                count1--;
                count2--;
            }

        }

        count1=0;
        count2=0;

        for (int val :nums){

            if(val == num1){
                count1++;
            }else if(val == num2){
                count2++;
            }

        }

        if(count1 > (nums.length/3)){
            res.add(num1);
        }

        if(count2 > (nums.length/3)){
            res.add(num2);
        }
        return res;

    }
}
