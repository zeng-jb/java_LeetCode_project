import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=1464 lang=java
 *
 * [1464] 数组中两元素的最大乘积
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        // int max = 0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         max = Math.max(max, (nums[i]-1)*(nums[j]-1));
        //     }
        // }
        // return max;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++) q.add(nums[i]);
        return (q.poll()-1)*(q.poll()-1);
    }
}
// @lc code=end

