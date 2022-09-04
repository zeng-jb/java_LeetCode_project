import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        // int n = nums.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, 1);
        // int ans = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         if(nums[i] > nums[j]){
        //             dp[i] = Math.max(dp[i], dp[j]+1);
        //         }
        //     }
        //     ans = Math.max(ans, dp[i]);
        // }

        // return ans;


        int n = nums.length;
        int[] tail = new int[n];
        int res = 0;
        for(int num : nums){
            int i=0,j=res;
            while(i<j){
                int m = (i+j)/2;
                if(tail[m] < num) i = m + 1;
                else j = m;
            }
            tail[i] = num;
            if(res == j) res++;
        }
        return res;
    }
}
// @lc code=end

