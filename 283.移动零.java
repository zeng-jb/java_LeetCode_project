/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0;
        int fast = 0;

        while(slow < n){
            if(fast == n){
                nums[slow++] = 0;
            }else{
                if(nums[fast] != 0){
                    nums[slow++] = nums[fast++];
                }else{
                    fast++;
                }
            }          
        }
    }
}
// @lc code=end

