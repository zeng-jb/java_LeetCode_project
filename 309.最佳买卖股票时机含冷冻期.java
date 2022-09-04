/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <= 1) return 0;
        // 最大效益
        int[][] dp = new int[n][3];
        dp[0][0] = 0;               //不持股且当天没卖出
        dp[0][1] = -1*prices[0];    //持股
        dp[0][2] = 0;               //不持股且当天  卖出

        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]-prices[i]);
            dp[i][2] = dp[i-1][1] + prices[i];
        }

        // 返回不持股的最大收益，
        return Math.max(dp[n-1][0], dp[n-1][2]);
    }
}
// @lc code=end

