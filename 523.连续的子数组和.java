import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=523 lang=java
 *
 * [523] 连续的子数组和
 */

// @lc code=start
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        for(int i=1;i<=n;i++) prefix[i] = prefix[i-1]+nums[i-1];

        Set<Integer> set = new HashSet<>();
        for(int i=2;i<=n;i++){
            set.add(prefix[i-2]%k);
            if(set.contains(prefix[i]%k)) return true;
        }
        return false;
    }
}
// @lc code=end

