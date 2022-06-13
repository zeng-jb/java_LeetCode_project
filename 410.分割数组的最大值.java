/*
 * @lc app=leetcode.cn id=410 lang=java
 *
 * [410] 分割数组的最大值
 */

// @lc code=start
class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;
        //记录数组最大值中的最小值
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        //二分法
        while(left < right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            int cnt = 1;
            for (int num : nums) {
                if(sum + num > mid){
                    sum = 0;
                    cnt++;
                }
                sum += num;
            }
            //如果cnt大于m，表明划分太多的子数组，即一个子数组容量太小，所以要扩大子数组的容量
            if(cnt > m){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
// @lc code=end

