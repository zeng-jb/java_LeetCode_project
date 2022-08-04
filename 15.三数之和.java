import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /* 
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);  //先排序

        for(int k=0;k<nums.length-2;k++){   //确保后面还有两个
            if(nums[k] > 0) break;      //如果此时大于0了，和就会大于0
            if(k > 0 && nums[k] == nums[k-1]) continue; //去重
            int left = k+1;
            int right = nums.length-1;
            while(left < right){
                int ans = nums[k] + nums[left] + nums[right];
                if(ans < 0){
                    while(left < right && nums[left] == nums[++left]);
                }else if(ans > 0){
                    while(left < right && nums[right] == nums[--right]);
                }else{
                    ret.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[left],nums[right])));
                    while(left < right && nums[left] == nums[++left]);
                    while(left < right && nums[right] == nums[--right]);
                }
            }
        }

        return ret;
        */
    
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if(nums[k] > 0) break;
            if(k>0 && nums[k] == nums[k-1]) continue;
            int left = k+1;
            int right = nums.length-1;
            while(left < right){
                int ans = nums[k] + nums[left] + nums[right];
                if(ans < 0){
                    while(left < right && nums[left] == nums[++left]);
                }else if(ans > 0){
                    while(left < right && nums[right] == nums[--right]);
                }else{
                    ret.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[left],nums[right])));
                    while(left < right && nums[left] == nums[++left]);
                    while(left < right && nums[right] == nums[--right]);
                }
            }
        }


        return ret;
    }
}
// @lc code=end

