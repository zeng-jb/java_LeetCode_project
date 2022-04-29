package jainzhi;

public class J47 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] grid = {
		                {1,3,1},
		                {1,5,1},
		                {4,2,1}
					};
		System.out.println(maxValue(grid));
	}

	
	public static int maxValue1(int[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		int[] dp = new int[n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				dp[j] = Math.max(dp[j], dp[j-1]) + grid[i-1][j-1];
			}
		}
		
		return dp[n];
    }

	public static int maxValue(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		
		for(int i=1;i<m;i++) {
			//初始化第一列
			grid[i][0] += grid[i-1][0];
		}
		for(int j=1;j<n;j++) {
			grid[0][j] += grid[0][j-1];
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				grid[i][j] += Math.max(grid[i-1][j], grid[i][j-1]);
			}
		}
		
		return grid[m-1][n-1];
	}
	
}
