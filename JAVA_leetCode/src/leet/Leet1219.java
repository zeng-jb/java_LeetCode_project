package leet;

public class Leet1219 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
		System.out.println(getMaximumGold(grid));
	}
	
	static int[][]dirs = {{-1,0},{1,0},{0,-1},{0,1}};
	static int m ;
	static int n ;
	private static int[][] g;
	public static int getMaximumGold(int[][] grid) {
		g = grid;
		m = grid.length;
		n = grid[0].length;
		
		int ans = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				ans = Math.max(ans, dfs( i, j));
				
			}
		}
		return ans;
    }
	
	 private static int dfs(int x, int y){
	        if(x < 0 || y < 0 || x == m || y == n || g[x][y] == 0)
	            return 0;
	        int cur = g[x][y], max = 0;
	        g[x][y] = 0;
	        for(int[] dir: dirs)
	            max = Math.max(max, dfs(x + dir[0], y + dir[1]));
	        g[x][y] = cur;
	        return cur + max;
	    }


		
}
