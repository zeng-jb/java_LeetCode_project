/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    /* 
    public boolean canJump(int[] nums) {
        if(nums.length <=1) return true;
        // 不用考虑最后一个，因为已经到了，不管里面是什么
        for(int i=nums.length-2;i>-1;i--){
            if(nums[i] == 0){
                int j = 0;
                for(j=i-1;j>-1;j--){
                    if(nums[j] > i-j) break;
                }
                if(j == -1) return false;
            }
        }
        return true;
    }
 */
    public boolean canJump(int[] nums) {
        if(nums.length == 0) return true;
        int cur = nums[0];
        int i = 1;
        for(;cur!=0 && i<nums.length;i++){
            cur--;
            if(nums[i] > cur){
                cur = nums[i];
            }
        }

        return i == nums.length;
    }
}
// @lc code=end

