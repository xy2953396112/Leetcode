package Leetcode.code_347_Top_K_Frequent_Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> frequencyMap = new HashMap<Integer, Integer>();

        //形成 key:出现次数
        for(int n : nums){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }

        //形成出现次数:key
        for(int key : frequencyMap.keySet()){
              int frequency = frequencyMap.get(key);
              if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
              }
              bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        //大的出现次数先添加到res中，k控制循环多少次
        for(int pos = bucket.length-1;pos >=0 && res.size() < k;pos--){
            if(bucket[pos] != null){
                res.addAll(bucket[pos]);
            }
        }

        return res;
    }

}
