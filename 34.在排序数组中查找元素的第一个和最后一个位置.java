/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int[] res = new int[]{-1,-1};

        while(left < right){
            int mid  = left + (right - left) / 2;
            if(nums[mid] >= target) right = mid;
            else left = mid + 1;
        }
        
        if(nums[left] != target) return res;
        res[0] = left;
        right = len;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target) left = mid + 1;
            else right = mid;
        }
        res[1] = left - 1;

        return res;
    }
}
// @lc code=end

