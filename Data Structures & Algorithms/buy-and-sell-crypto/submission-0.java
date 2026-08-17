class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = 101;
        int result = 0;
        for (int i = 0; i < prices.length; i++){
            if (minBuy > prices[i]){
                minBuy = prices[i];
            }
            else {
                result = Math.max(result, prices[i]-minBuy);
            }
        }
        return result;
        
    }
}
