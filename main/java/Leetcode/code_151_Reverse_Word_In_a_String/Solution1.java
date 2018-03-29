package Leetcode.code_151_Reverse_Word_In_a_String;

public class Solution1 {
    public String reverseWords(String s) {
        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; --i) {
            res += words[i] + " ";
        }
        return res + words[0];
    }
}
