import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2063 lang=java
 *
 * [2063] 所有子字符串中的元音
 */

// @lc code=start
class Solution {
    public long countVowels(String word) {
        int n = word.length();
        long[] dp = new long[n+1];
        for(int i=1;i<=n;i++){
            char ch = word.charAt(i-1);
            // 每个元音字符所在位置贡献值是i加之前
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                dp[i] = dp[i-1] + i;
            }else{
                dp[i] = dp[i-1];
            }
        }
        return Arrays.stream(dp).sum();


        // long ans = 0;
        // int n = word.length();
        // for(int i=0;i<n;i++){
        //     // 每个元音所在位置的贡献是
        //     char ch = word.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
        //         ans += (i+1)*(n-i);
        //     }
        // }
        // return ans;
    }
}
// @lc code=end

