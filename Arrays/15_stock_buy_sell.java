// Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
// BRUTE: [tc=O(n^2), sc=O(1)] two loops
// BETTER: [tc=O(n), sc=O(1)] take 3 count variables.

class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], maxprofit=0;
        int n=prices.length;
        for(int i=1; i<n; i++){
            buy=Math.min(buy, prices[i]);
            // buy should be the lower value.
            maxprofit=Math.max(maxprofit, prices[i]-buy);
            
        }
        return maxprofit;
    }
}