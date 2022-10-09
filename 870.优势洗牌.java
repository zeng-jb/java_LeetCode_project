import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=870 lang=java
 *
 * [870] 优势洗牌
 */

// @lc code=start
class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[][] index = new int[n][2];
        for(int i=0;i<n;i++){
            index[i][0] = nums2[i];
            index[i][1] = i;
        }
        Arrays.sort(nums1);
        Arrays.sort(index, (a,b)->b[0]-a[0]);

        int left = 0, right = n-1;
        for(int i=0;i<n;i++){
            if(nums1[right] > index[i][0]){
                nums2[index[i][1]] = nums1[right--];
            }else{
                nums2[index[i][1]] = nums1[left++];
            }
        }

        return nums2;
    }
}
// @lc code=end

