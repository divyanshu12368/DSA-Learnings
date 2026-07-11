class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if (buyprice < prices[i]){
                int Profit = prices[i] - buyprice;
                maxProfit = Math.max(maxProfit, Profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }
}