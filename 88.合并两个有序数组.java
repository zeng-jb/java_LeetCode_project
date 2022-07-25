/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int p = m-- + n-- - 1;
        // while(n>=0){
        //     nums1[p--] = (m>=0 && nums1[m]>nums2[n]) ? nums1[m--] : nums2[n--];
        // }
        int p = m + n - 1;
        m--;n--;
        while(n>=0){
            if(m >= 0 && nums1[m] > nums2[n]){
                nums1[p--] = nums1[m--];
            }else{
                nums1[p--] = nums2[n--];
            }
        }
    }
}
// @lc code=end

