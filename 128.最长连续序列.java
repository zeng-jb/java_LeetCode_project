import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums == null || nums.length == 0) return 0;
        // Arrays.sort(nums);
        // int maxLen = 1;
        // int temp = 1;
        // for(int i=1;i<nums.length;i++){
            
        //     if(nums[i] == nums[i-1]) continue;
        //     if(nums[i] == nums[i-1] + 1){
        //         temp++;
        //         maxLen = Math.max(maxLen, temp);
        //     }else{
        //         temp = 1;
        //     }
        // }
        // return maxLen;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int maxLen = 0;

        for(int num : set){
            // 连续从第一个开始
            if(!set.contains(num-1)){
                int tempLen = 1;
                int currNum = num;

                while(set.contains(currNum+1)){
                    tempLen++;
                    currNum++;
                }

                maxLen = Math.max(maxLen, tempLen);
            }
        }

        return maxLen;
    }
}
// @lc code=end

