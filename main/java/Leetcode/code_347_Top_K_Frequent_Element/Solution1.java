package Leetcode.code_347_Top_K_Frequent_Element;

import java.util.*;

public class Solution1 {

    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        TreeMap<Integer,List<Integer>> freqMap = new TreeMap<>();

        for(int num:map.keySet()){
            int freq = map.get(num);
            if(!freqMap.containsKey(freq)){
                freqMap.put(freq,new LinkedList<>());
            }
            freqMap.get(freq).add(num);
        }

        List<Integer> res = new ArrayList<>();

        while(res.size() < k){
            Map.Entry<Integer,List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }

        return res;

    }
}
