package leet;

public class Leet883 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] grid = {{1,2},{3,4}};
		Leet883 obj = new Leet883();
		System.out.println(obj.projectionArea(grid));
	}

	
	public int projectionArea(int[][] grid) {
		int ans = 0;
		int m = grid.length;
		int n = grid[0].length;
		int[] colMax = new int[n];
		for(int i=0;i<m;i++) {
			int rowMax = 0;
			for(int j=0;j<n;j++) {
				if(grid[i][j] != 0) {
					ans++;
				}
				rowMax = Math.max(rowMax, grid[i][j]);
				colMax[j] = Math.max(colMax[j], grid[i][j]);
			}
			ans += rowMax;
		}
		for(int i=0;i<n;i++) {
			ans += colMax[i];
		}
		return ans;
    }
}
