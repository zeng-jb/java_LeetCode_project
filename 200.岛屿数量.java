/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int maxNum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    maxNum++;
                }
            }
        }
        return maxNum;
    }

    public void dfs(char[][] grid,int i,int j){
        if(i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] != '1'){
                return;
            }

        grid[i][j] = '2';
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
    }
}
// @lc code=end

