/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums,target,0,0);
        return count;

    }

    public void backTrack(int[] nums, int target, int start, int sum){
        if(start == nums.length && sum == target){
            count++;
            return;
        }

        if(start >= nums.length) return;

        backTrack(nums, target, start+1, sum+nums[start]);
        backTrack(nums, target, start+1, sum-nums[start]);
    }
}
// @lc code=end

