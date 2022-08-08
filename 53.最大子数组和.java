/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    /* 
    public int maxSubArray1(int[] nums) {
        int sum = 0;
        int res = nums[0];

        for(int num : nums){
            if(sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
    */
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        for(int num : nums){
            if(sum > 0){
                sum += num;
            }else{
                sum  = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
// @lc code=end

