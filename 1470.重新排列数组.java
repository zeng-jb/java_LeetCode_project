/*
 * @lc app=leetcode.cn id=1470 lang=java
 *
 * [1470] 重新排列数组
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n+n];
        int index = 0;
        for(int i=0;i<n;i++){
            res[index++] = nums[i];
            res[index++] = nums[n+i];
        }
        return res;
    }
}
// @lc code=end

