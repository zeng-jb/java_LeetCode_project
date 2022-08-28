import java.util.Arrays;
import java.util.PriorityQueue;

import javafx.print.PrintQuality;

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int num : nums){
            p.add(num);
            if(p.size()>k){
                p.poll();
            }
        }
        return p.peek();
    }
}
// @lc code=end

