/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int firstIndex = -1;
        for(int i=nums.length-2;i>=0;i--){
            //从后往前找第一个相邻递增的
            if(nums[i] < nums[i+1]){
                firstIndex = i;
                break;
            }
        }

        if(firstIndex == -1){
            //如果不存在就是完全倒序，直接反转
            reverse(nums, 0, nums.length-1);
            return;
        }

        int secondIndex = -1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] > nums[firstIndex]){
                // 从后往前找第一个大于fisr的数
                secondIndex = i;
                break;
            }
        }

        //交换fir和sec位置
        swap(nums, firstIndex, secondIndex);
        //将fir之后的全部都倒序
        reverse(nums, firstIndex+1, nums.length-1);

    }

    private void reverse(int[] nums, int i, int k){
        while(i < k){
            swap(nums, i++, k--);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

