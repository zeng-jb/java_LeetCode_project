/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int len =  matrix.length;
        r(matrix,0,len-1,len-1);
    }

    public void r(int[][] matrix, int start, int end, int len){
        if(start > end) return;
        for(int i=0;i<len;i++){
            int temp = matrix[start][start+i];
            matrix[start][start+i] = matrix[end-i][start];
            matrix[end-i][start] = matrix[end][end-i];
            matrix[end][end-i] = matrix[start+i][end];
            matrix[start+i][end] = temp;
        }
        r(matrix, start+1, end-1, len-2);
    }
}
// @lc code=end

