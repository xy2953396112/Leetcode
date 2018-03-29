package Leetcode.code_172_Factorial_Trailing_Zeroes;

public class Solution {
    public int trailingZeroes(int n) {

        return n==0 ? 0 : n/5 + trailingZeroes(n/5);

    }
}
