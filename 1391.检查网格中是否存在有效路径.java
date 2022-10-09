/*
 * @lc app=leetcode.cn id=1391 lang=java
 *
 * [1391] 检查网格中是否存在有效路径
 */

// @lc code=start
class Solution {
    int m,n;
    int[][] dire = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    // 构建管道图，0下1右2上3左 -1不通
    // pipe[3][2]=3，代表3号拼图可以由向上的方向进入其中，并转向左方向继续前进。
    // pipe[5][3]=-1，代表5号拼图不可以由向左的方向进入其中
    int[][] pipe = new int[][]{{-1,-1,-1,-1},{-1,1,-1,3},{0,-1,2,-1},{-1,0,3,-1},{-1,-1,1,0},{3,2,-1,-1},{1,-1,-1,2}};
    boolean[][] vis = new boolean[302][302];
    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int sta = grid[0][0];
        for(int i=0;i<4;i++){
            if(pipe[sta][i] != -1){
                if( dfs(grid,0,0,pipe[sta][i])) return true;
            }
        }

        return false;
    }

    public boolean dfs(int[][] grid, int x, int y, int dir){
        vis[x][y] = true;
        if(x==m-1 && y==n-1) return true;
        int xx = x + dire[dir][0];
        int yy = y + dire[dir][1];
        if(xx<0 || xx>=m || yy<0 || yy>=n) return false;
        
        int next = grid[xx][yy];
        if(pipe[next][dir] != -1 && !vis[xx][yy]) return dfs(grid, xx, yy, pipe[next][dir]);

        return false;
    }
}
// @lc code=end

