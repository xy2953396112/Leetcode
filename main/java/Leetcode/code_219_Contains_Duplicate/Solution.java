package Leetcode.code_219_Contains_Duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

          if(nums==null && k<1 && nums.length<2){
              return false;
          }

          Map<Integer,Integer> map = new HashMap();

          for(int i=0;i<nums.length;i++){

              if(!map.containsKey(nums[i])){

                  map.put(nums[i],i);
              }else{
                  int value = map.get(nums[i]);
                  if(i - value <=k)
                      return true;

                  map.put(nums[i],i);
              }
          }

          return false;
    }

}