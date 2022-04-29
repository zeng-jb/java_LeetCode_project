package leet;

public class Leet1020 {

	static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][]grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
//		int [][]grid = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
		System.out.println(numEnclaves(grid));
	}

	static int m,n;
	public static int numEnclaves(int[][] grid) {
		int ans = 0;
		m = grid.length;
		n = grid[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==m-1 || j==0 || j==n-1) {
					dfs(grid,i,j);
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j] == 1) {
					ans++;
				}
			}
		}
		return ans;
    }

	private static void dfs(int[][] grid, int x, int y) {
		// TODO 自动生成的方法存根
		if(x<0 || x>=m || y<0 || y>=n || grid[x][y] == 0) return ;
		grid[x][y] = 0;
		dfs(grid, x+1, y);
		dfs(grid, x-1, y);
		dfs(grid, x, y+1);
		dfs(grid, x, y-1);
	}
}
