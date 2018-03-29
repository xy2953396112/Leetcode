package Leetcode.code_003_Longest_Substring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubString(String s){

        if( s == null){
            return 0;
        }

        int result = 0 ;

        int start = 0;

        Map<Character,Integer> map = new HashMap<>(s.length());

        for(int i = 0; i < s.length();i++){

            char ch = s.charAt(i);

            if(map.containsKey(ch) && map.get(ch) >= start){
                start = map.get(ch) + 1;
            }
            // 如果没有出现过就求最大的非重复子串的长度
            else {
                result = Math.max(result, i - start + 1);
            }

            // 更新访问记录
            map.put(ch, i);
        }


        return result;
    }
}
