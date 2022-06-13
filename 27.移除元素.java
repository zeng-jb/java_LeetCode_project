/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            if(nums[left] == val){
                nums[left] = nums[right--];
            }else{
                left++;
            }
        }
        return left;
    }
}
// @lc code=end

