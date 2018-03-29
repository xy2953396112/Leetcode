package Leetcode.code_070_Climbing_Stairs;

public class code_070_Climbing_Stairs {

    public int climbStairs(int n) {
        if(n==1||n==2){
            return n;
        }else{
            return climbStairs(n-2)+climbStairs(n-1);
        }
    }

    public static void main(String[] args) {
        code_070_Climbing_Stairs obj = new code_070_Climbing_Stairs();
         System.out.println(obj.climbStairs(4));
    }

}
