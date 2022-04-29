package leet;

import java.util.Arrays;

public class Leet1706 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
		System.out.println(findBall1(grid));
	}

	public static int[] findBall(int[][] grid) {
		int n = grid[0].length;
		int [] ans = new int[n];
		Arrays.fill(ans, -1);
		
		for(int j=0;j<n;j++) {
			int col = j;
			for(int[] row : grid) {
				int dir = row[col];
				col += dir;	//移动球
				if(col < 0 || col >= n || row[col] != dir) {
					col = -1;
					break;
				}
			}
			if(col>=0) {		//成功到达底部
				ans[j] = col;
			}
		}
		
		
		return ans;
    }
	//DFS
	static int m,n;
	public static int[] findBall1(int[][] grid) {
		m = grid.length;
		n = grid[0].length;
		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		for(int j=0;j<n;j++) {
			ans[j] = DFS(grid,j,0);
		}
		
		return ans;
	}

	private static int DFS(int[][] grid, int x, int h) {
		// TODO 自动生成的方法存根
		if(h == m) return x;
		//当前格子向右移，遇到右墙或者右边向左形成V，不通
		else if(grid[h][x] == 1 && (x==n-1 || grid[h][x+1]== -1)) return -1;
		else if(grid[h][x] == -1 && (x == 0 || grid[h][x-1] == 1)) return -1;
		else return DFS(grid, x+grid[h][x], h+1);
	}
}
