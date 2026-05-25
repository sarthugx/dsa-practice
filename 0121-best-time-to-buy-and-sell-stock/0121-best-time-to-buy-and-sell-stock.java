class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];

        for(int i = 0; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else{
                int currProfit = prices[i] - buyPrice;
                if(currProfit > profit){
                    profit = currProfit;
                }
            }
        }
        return profit;
    }
}