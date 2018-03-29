package Leetcode.code_151_Reverse_Word_In_a_String;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}
