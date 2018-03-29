package Leetcode.code_274_H_Index;

import java.util.Arrays;

public class Solution {

      public int hindex(int[] citations){

          Arrays.sort(citations);
          int result = 0;
          for(int i=1;i<=citations.length;i++){
              if(citations[citations.length - i] >= i){
                  result = i;
              }else{
                  break;
              }
          }
        return result;
      }
}
