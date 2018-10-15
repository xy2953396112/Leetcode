package Leetcode.code_005_Longest_Palindromic_Substring;

import java.util.HashMap;
import java.util.Map;

/**
 * /**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/10/12.
 */
public class Solution {

    private static int low;//回文子串的起始位置
    private static int maxLen;//回文子串的最大长度
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2) return s;
        for(int i=0;i<len;i++){
            extendPalindrome(s,i,i);//回文子串是奇数的情况
            extendPalindrome(s,i,i+1);//回文子串是偶数的情况
        }
        return s.substring(low, low+maxLen);
    }
    private static void extendPalindrome(String s, int j, int k) {
        while(j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(maxLen<k-j-1){
            low=j+1;
            maxLen=k-j-1;
        }

    }
}
