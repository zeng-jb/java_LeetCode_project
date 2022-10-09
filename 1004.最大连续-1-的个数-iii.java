/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;

        while(right < n){
            if(nums[right] == 0) k--;
            right++;

            if(k < 0){
                if(nums[left] == 0) k++;
                left++;
            }
        }

        return right-left;
    }
}
// @lc code=end

