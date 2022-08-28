/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /* 
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n-1;
        if(matrix[i][j] == target) return true;
        while(i <= m-1 && j >= 0){
            if(matrix[i][j] < target){
                i++;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                return true;
            }
        }
        return false;
        */
    
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row <= m-1 && col >= 0){
            if(matrix[row][col] > target){
                col--;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                return true;
            }
        }

        return false;
    }
}
// @lc code=end

