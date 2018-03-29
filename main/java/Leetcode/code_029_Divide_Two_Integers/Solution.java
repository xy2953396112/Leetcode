package Leetcode.code_029_Divide_Two_Integers;

public class Solution {

    public int divide(int dividend, int divisor) {

        int sign = 1;   //正反的标志位

        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            sign = -1;

        long a  = Math.abs((long) dividend);
        long b  = Math.abs((long) divisor);

        if(b==0)  return Integer.MAX_VALUE;

        if((a==0) || (a < b))  return 0;

        long lans = ldivide(a,b);

        int ans;

        if(lans > Integer.MAX_VALUE){
            ans = (sign == 1 ) ? Integer.MAX_VALUE:Integer.MIN_VALUE;

        }else{
            ans = (int)(sign * lans);

        }
        return ans;
    }

    private long ldivide(long ldividend,long ldivisor){

        if(ldividend < ldivisor) return 0;

        long sum = ldivisor;

        long multiple = 1;

        while((sum + sum ) <= ldividend){
             sum+=sum;
             multiple += multiple;
        }

        return multiple + ldivide(ldividend - sum,ldivisor);
    }
}
