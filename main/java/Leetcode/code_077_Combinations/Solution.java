package Leetcode.code_077_Combinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> result ;
    List<Integer>  l;

    public List<List<Integer>> combine(int n, int k) {

       if(n>0 && k>0 && n>=k){
           l = new LinkedList<>();
           combine(1,n,k);


       }

        return result;
    }

    public void combine(int start,int end,int num){

        if(num==0){
            List temp = new LinkedList();
            for(Integer i:l){
                temp.add(i);

            }
            result.add(temp);
        }

        for(int i=start;i<end;i++){
            l.add(i);
            combine(i+1,end,num-1);
            l.remove(i);
        }


    }
}
