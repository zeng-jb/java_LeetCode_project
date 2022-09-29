import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=698 lang=java
 *
 * [698] 划分为k个相等的子集
 */

// @lc code=start
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // 求出数组和，如果不能整除k直接返回false
        int sum = Arrays.stream(nums).sum();
        if(sum % k != 0) return false;
        // 每个桶和
        sum /= k;
        // 排序，如果最大的都大于捅和返回false
        Arrays.sort(nums);
        if(nums[nums.length-1] > sum) return false;
        // 建立k个桶，初始化每个桶和
        int[] arr = new int[k];
        Arrays.fill(arr, sum);

        return hlper(nums,nums.length-1,arr);
    }

    public boolean hlper(int[] nums, int cur, int[] arr){
        // 如果下标小于0了说明到头了返回true
        if(cur < 0){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            // 判断条件，符合就进行回溯
            if(arr[i] == nums[cur] || (cur > 0 && arr[i]-nums[cur] >= nums[0])){
                arr[i] -= nums[cur];
                if(hlper(nums, cur-1, arr)){
                    return true;
                }
                arr[i] += nums[cur];
            }
        }
        return false;
    }
}
// @lc code=end

