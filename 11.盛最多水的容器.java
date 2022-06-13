/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while(left < right){
            int l = right - left ;
            int h = Math.min(height[left], height[right]);
            area = Math.max(area, l*h);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return area;
    }
}
// @lc code=end

