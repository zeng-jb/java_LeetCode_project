/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == maj){
                count++;
            }else{
                count--;
                if(count == 0){
                    maj = nums[i+1];
                }
            }
        }
        return maj;
    }
}
// @lc code=end

