package Leetcode.code_118_Pascal_Triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        if(numRows<=0){
            return null;
        }

        List<List<Integer>> list = new ArrayList<>();

        if(numRows>=1){
           List<Integer> l = new ArrayList<>();
           l.add(1);
           list.add(l);
        }

        if(numRows>=2){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            l.add(1);
            list.add(l);

        }

        if(numRows>=3){

            for(int i=3;i<=numRows;i++){

                List<Integer> l = new ArrayList<>();
                List<Integer> prev = list.get(i-2);
                for(int j=2;j<=i-1;j++){
                    l.add(prev.get(j-2) + prev.get(j-1));
                }
                l.add(1);

               list.add(l);
            }

        }

        return list;
    }
}
