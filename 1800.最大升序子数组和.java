/*
 * @lc app=leetcode.cn id=1800 lang=java
 *
 * [1800] 最大升序子数组和
 */

// @lc code=start
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int temp = max;
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                max = Math.max(max, temp);
                temp = nums[i];
            }else{
                temp += nums[i];
            }

        }
        max = Math.max(max, temp);

        return max;
    }
}
// @lc code=end

