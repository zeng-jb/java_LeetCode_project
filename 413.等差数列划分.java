/*
 * @lc app=leetcode.cn id=413 lang=java
 *
 * [413] 等差数列划分
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        int ans = 0;
        int d = nums[0] - nums[1];
        int t = 0;
        for(int i=2;i<n;i++){
            if(nums[i-1] - nums[i] == d){
                t++;
            }else{
                t = 0;
                d = nums[i-1] - nums[i];
            }
            ans += t;
        }
        return ans;
    }
}
// @lc code=end

