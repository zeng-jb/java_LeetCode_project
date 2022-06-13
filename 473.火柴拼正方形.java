import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=473 lang=java
 *
 * [473] 火柴拼正方形
 */

// @lc code=start
class Solution {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4)
            return false;
        int sum = 0;
        for (int matchstick : matchsticks) {
            sum += matchstick;
        }
        if (sum % 4 != 0)
            return false;
        Arrays.sort(matchsticks);
        return allocate(matchsticks, matchsticks.length - 1, new int[4], sum / 4);
    }

    private boolean allocate(int[] nums, int pos, int[] sums, int avg) {
        if (pos == -1) {
            return sums[0] == avg && sums[1] == avg && sums[2] == avg;
        }

        for (int i = 0; i < 4; i++) {
            if (sums[i] + nums[pos] > avg)
                continue;
            sums[i] += nums[pos];
            if (allocate(nums, pos - 1, sums, avg)) {
                return true;
            }
            sums[i] -= nums[pos];
        }
        return false;
    }
}
// @lc code=end
