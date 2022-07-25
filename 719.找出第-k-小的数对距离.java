import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=719 lang=java
 *
 * [719] 找出第 K 小的数对距离
 */

// @lc code=start
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums[nums.length-1] - nums[0];
        while(l < r){
            int mid = l + (r - l) / 2;
            int count = 0;
            int j = 0;
            for(int i=1;i<nums.length;i++){
                while(nums[i] - nums[j] > mid) j++;
                count += i - j;
            }
            if(count < k){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return l;
    }
}
// @lc code=end

