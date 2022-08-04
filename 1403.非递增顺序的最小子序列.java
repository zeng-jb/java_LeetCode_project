import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1403 lang=java
 *
 * [1403] 非递增顺序的最小子序列
 */

// @lc code=start
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i=n-1;i>=n/2-1;i--){
            if(count > sum/2){
                break;
            }
            ans.add(nums[i]);
            count += nums[i];
        }
        return ans;
    }
}
// @lc code=end

