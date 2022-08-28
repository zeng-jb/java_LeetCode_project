import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);

        int left = 1;
        int right = 1;
        for(int i=0;i<n;i++){
            // 左右累乘，保存左右的乘级
            res[i] *= left;
            left *= nums[i];

            res[n-i-1] *= right;
            right *= nums[n-i-1];
        }

        return res;
    }
}
// @lc code=end

