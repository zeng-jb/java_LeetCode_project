/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
    /*这里使用动态规划来做。时间复杂度O(nlogn)，空间复杂度O(n)。代码非常精简

    定义一个函数f(n)表示我们要求的解。f(n)的求解过程为：
    f(n) = 1 + min{
    f(n-1^2), f(n-2^2), f(n-3^2), f(n-4^2), ... , f(n-k^2) //(k为满足k^2<=n的最大的k)
    }
    */
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            int minVal = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                minVal = Math.min(dp[i-j*j], minVal);
            }
            dp[i] = minVal + 1;
        }
        return dp[n];

    }
}
// @lc code=end

