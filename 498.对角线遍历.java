/*
 * @lc app=leetcode.cn id=498 lang=java
 *
 * [498] 对角线遍历
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length ==0){
            return new int[]{};
        }
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int [row * col];
        int r = 0, c = 0;
        for(int i=0;i<res.length;i++){
            res[i] = mat[r][c];
            if((r+c) % 2 == 0){
                if(c == col-1){
                    r++;
                }else if(r == 0){
                    c++;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r == row-1){
                    c++;
                }else if(c == 0){
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
// @lc code=end

