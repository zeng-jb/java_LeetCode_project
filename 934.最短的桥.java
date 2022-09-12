import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=934 lang=java
 *
 * [934] 最短的桥
 */

// @lc code=start
class Solution {
    int m,n;
    int[][] dire = {{-1,0},{0,1},{1,0},{0,-1}};
    public int shortestBridge(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        // 队列，记录所有0的海洋哦
        Queue<int[]> points = new ArrayDeque<>();

        boolean flag = false;
        // 找出第一个岛屿，并且把周围的海洋入队列
        for(int i=0;i<m;i++){
            if(flag) break;
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    flag = true;
                    dfs(points,grid,i,j);
                    break;
                }
            }
        }

        // BFS找出与第二个岛屿的最近距离
        int count = 0;
        while(!points.isEmpty()){
            count++;
            // 第一个岛屿的附件海洋开始遍历
            int size = points.size();
            while(size-- > 0){
                int[] point = points.poll();
                for(int[] dir : dire){
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];

                    if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 2){
                        continue;
                    }
                    // 如果到达1，说明已经到第一个岛屿
                    if(grid[x][y] == 1){
                        return count;
                    }

                    points.add(new int[]{x,y});
                    // 置2表示已访问
                    grid[x][y] = 2;
                }
            }
        }
        return 0;
    }

    public void dfs(Queue<int[]> points, int[][] grid, int i, int j){
        if(i < 0 || i>=m || j < 0 || j >= n || grid[i][j] == 2){
            return;
        }
        // 海洋加入队列
        if(grid[i][j] == 0){
            points.add(new int[]{i,j});
            return;
        }
        // 将第一个岛屿置为2，并且访问周围
        grid[i][j] = 2;
        dfs(points, grid, i+1, j);
        dfs(points, grid, i-1, j);
        dfs(points, grid, i, j+1);
        dfs(points, grid, i, j-1);

    }
}
// @lc code=end

