package Leetcode.code_049_Group_Anagrams;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null) return new ArrayList<List<String>>();

        Map<String,List<String>> map = new HashMap<String,List<String>>();

        for(String s:strs){

            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if(!map.containsKey(keyStr))
                 map.put(keyStr,new ArrayList<String>());//value是一个List
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
