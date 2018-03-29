package Test;

public class Solution {

    //数组，有正有-，和做大   连续子序列


      public static int subArray(int[] nums){

         int result = Integer.MIN_VALUE;

         int max = 0;

         for(int i=0;i<nums.length;i++){
             max = Math.max( max + nums[i],nums[i]);

             result = Math.max(result,max);
         }

         return result;
      }

      public static  void main(String[] args){

          int[] a = {-2 ,3 ,4, -1, 6 ,-14 ,6 ,9 ,-4};


          System.out.println(subArray(a));
      }
}
