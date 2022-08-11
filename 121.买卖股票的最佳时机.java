/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    // 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
    /*
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        int minPrice = prices[0];
        for(int i=1;i<n;i++){
            dp[i] = Math.max(dp[i-1], prices[i] - minPrice);
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return dp[n-1];
    }
 */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sum = 0;
        int minPrice = prices[0];
        for(int i=1;i<n;i++){
            sum = Math.max(sum, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return sum;
    }
}
// @lc code=end

