import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1619 lang=java
 *
 * [1619] 删除某些元素后的数组均值
 */

// @lc code=start
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum = 0;
        for(int i=arr.length/20;i<arr.length*19/20;i++){
            sum += arr[i];
        }

        return (double)sum/(arr.length*9/10);
    }
}
// @lc code=end

