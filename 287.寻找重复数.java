/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        
        // int n = nums.length;
        // int left = 1;
        // int right = n;
        // while(left < right){
        //     int mid = left + (right - left) /2;
        //     int cnt = 0;
        //     for(int num : nums){
        //         if(num <= mid) cnt++;
        //     }

        //     if(cnt <= mid){
        //         left = mid + 1;
        //     }else{
        //         right = mid;
        //     }
        // }
        // return right;



        int fast = 0;
        int slow = 0;
        while(true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(fast == slow){
                fast = 0;
                while(nums[fast] != nums[slow]){
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
// @lc code=end

