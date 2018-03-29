package Leetcode.code_134_Gas_station;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int start = 0;//起始位置
        int remain = 0;//剩余燃料
        int debt = 0; //负债

        for(int i=0;i< gas.length;i++){
            remain += gas[i] - cost[i];
            if(remain < 0){
                debt += remain;
                start = i + 1;
                remain = 0;
            }

        }

        return remain + debt >= 0 ? start : -1;
    }
}
