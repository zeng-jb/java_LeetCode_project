import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1879 lang=java
 *
 * [1879] 两个数组最小的异或值之和
 */

// @lc code=start
class Solution {
    public int minimumXORSum(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int range = 1<<n;
        int[] dp = new int[range];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=0;i<range;i++){
            for(int j=0;j<n;j++){
                //i的第j位为1
                if(((i>>j)&1) == 1){
                    //尝试选取nums1[num]和nums2[j]进行异或更新dp[i]
                    dp[i] = Math.min(dp[i], dp[i^(1<<j)] +  (nums1[Integer.bitCount(i) - 1] ^ nums2[j]));
                }
            }
        }

        return dp[range-1];
    }
}
// @lc code=end

