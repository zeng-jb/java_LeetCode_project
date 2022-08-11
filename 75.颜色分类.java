/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        for(int i=0;i<n;i++){
            while(i < right && nums[i] == 2){
                swap(nums,i,right);
                right--;
            }
            if(nums[i] == 0){
                swap(nums,i,left);
                left++;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

