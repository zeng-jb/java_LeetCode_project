/*
 * @lc app=leetcode.cn id=1413 lang=java
 *
 * [1413] 逐步求和得到正数的最小值
 */

// @lc code=start
class Solution {
    public int minStartValue(int[] nums) {
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for(int num : nums){
            sum += num;
            res = Math.min(res, sum);
        }
        return res > 0 ? 1 : Math.abs(res) + 1;
    }
}
// @lc code=end

