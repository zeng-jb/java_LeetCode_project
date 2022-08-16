import java.util.List;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                // 找出0到i可以划分的单词
                // dp[i] = dp[j] && sub(j,i); 当前是否可以划分取决于dpj和j到i的字串是否在word
                if(dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
// @lc code=end

