package Leetcode.code_028_Implement_strStr;

public class Solution {

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;   //返回最终结果，有限次循环
                if (i + j == haystack.length()) return -1;  //不成立条件
                if (needle.charAt(j) != haystack.charAt(i + j)) break;//不相等直接进行外层循环,说明两者的开头字符不相同，如果相同，再进行第二层循环，进行后面的字符比较
            }
        }
    }
}
