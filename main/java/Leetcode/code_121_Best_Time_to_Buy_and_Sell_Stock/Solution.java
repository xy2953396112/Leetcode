package Leetcode.code_121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {

    public int maxProfit(int[] prices){


        if(prices == null || prices.length < 1)
            return 0;
        int min = prices[0];
        int profit = 0;

        for(int i = 1;i < prices.length ; i++){
            //  找到更低的买入价
            if( min > prices[i]){
                min = prices[i];
            }else {
                // 如果当天卖出的价格比之前卖出的价格高
                if ( profit < prices[i] - min){
                    //更新卖出价
                    profit = prices[i] - min;
                }

            }



        }

         return profit;
    }
}
