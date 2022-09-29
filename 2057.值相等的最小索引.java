/*
 * @lc app=leetcode.cn id=2057 lang=java
 *
 * [2057] 值相等的最小索引
 */

// @lc code=start
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i % 10 == nums[i]) return i;
        }

        return -1;
    }
}
// @lc code=end

