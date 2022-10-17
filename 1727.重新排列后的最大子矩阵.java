import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1727 lang=java
 *
 * [1727] 重新排列后的最大子矩阵
 */

// @lc code=start
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int res = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                heights[j] = matrix[i][j] == 0 ? 0 : heights[j]+1;
            }

            int[] temp = heights.clone();
            Arrays.sort(temp);
        
            for(int j=0;j<n;j++){
                res = Math.max(res, temp[j]*(n-j));
            }
        }

        

        return res;
    }
}
// @lc code=end

