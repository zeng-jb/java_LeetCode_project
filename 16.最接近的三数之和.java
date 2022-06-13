import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int k=0;k<nums.length-2;k++){
            int l = k+1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[k] + nums[l] + nums[r];
                if(Math.abs(closestSum - target) > Math.abs(sum - target)){
                    closestSum = sum;
                }
                if(sum < target){
                    l++;
                }else if(sum > target){
                    r--;
                }else{
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
// @lc code=end

