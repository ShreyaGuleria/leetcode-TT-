class Solution {
    public int maxProfit(int[] prices) {

        int buy_day = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            
            if(prices[i] < buy_day) {
                buy_day = prices[i];
            }

            
            int profit = prices[i] - buy_day;

            
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}