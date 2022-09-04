/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] bitOne = new int[n+1];
        for(int i=0;i<=n;i++){
            // bitOne[i] = Integer.bitCount(i);
            bitOne[i] = bitOne[i >> 1] + (i & 1); // bi是bi右移一位 ，如果i为奇数则加1
            // bitOne[i] = bitOne[i & (i-1)] + 1; // 从1开始
        }
        return bitOne;
    }
}
// @lc code=end

