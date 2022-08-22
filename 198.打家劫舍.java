/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }

        return dp[n-1];
    }
}
// @lc code=end

