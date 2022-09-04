/*
 * @lc app=leetcode.cn id=1582 lang=java
 *
 * [1582] 二进制矩阵中的特殊位置
 */

// @lc code=start
class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int ans = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j] == 1 && check(mat,i,j)){
                    ans++;
                }
            }
        }

        return ans;
    }

    public boolean check(int[][] mat, int row, int col){
        boolean flag1 = true;
        boolean flag2 = true;

        for(int i=0;i<mat.length;i++){
            if(i == row){
                continue;
            }
            if(mat[i][col] == 1){
                flag1 = false;
                break;
            }
        }

        for(int j=0;j<mat[0].length;j++){
            if(j == col){
                continue;
            }
            if(mat[row][j] == 1){
                flag2 = false;
                break;
            }
        }
        
        return flag1 & flag2;
    }
}
// @lc code=end

