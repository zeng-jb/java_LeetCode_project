/*
 * @lc app=leetcode.cn id=1685 lang=java
 *
 * [1685] 有序数组中差绝对值之和
 */

// @lc code=start
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++) res[0] += Math.abs(nums[i]-nums[0]);
        //先计算出第一个数和后面所有数的差值和，然后每过一个数，这个差值和就会减少这个数和上个数的差值 这个数之后的 差值减少了 之前的还在 所以 减掉n 再加上多减的
        for(int i=1;i<n;i++) res[i] = res[i-1] + (nums[i]-nums[i-1])*(2*i-n);

        return res;
    }
}
// @lc code=end

