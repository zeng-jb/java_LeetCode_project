package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet417 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
		Leet417 obj = new Leet417();
		System.out.println(obj.pacificAtlantic(heights));
	}

	static int[][] heights;
	static int[][] dict = {{1,0},{0,1},{-1,0},{0,-1}};
	static int m , n;
	public List<List<Integer>> pacificAtlantic(int[][] heights) {
		this.heights = heights;
		m = heights.length;
		n = heights[0].length;
		boolean[][] pacific = new boolean[m][n];
		boolean[][] atlantic = new boolean[m][n];
		
		for(int i=0;i<m;i++) {
			dfs(i,0,pacific);
		}
		for(int j=0;j<n;j++) {
			dfs(0,j,pacific);
		}
		for(int i=m-1;i>=0;i--) {
			dfs(i, n-1, atlantic);
		}
		for(int j=n-1;j>=0;j--) {
			dfs(m-1, j, atlantic);
		}
		
		List<List<Integer>> ans = new ArrayList<>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(pacific[i][j] && atlantic[i][j]) {
					List<Integer> cnt = new ArrayList<>();
					cnt.add(i);
					cnt.add(j);
					ans.add(cnt);
				}
			}
		}
		return ans;
    }
	private void dfs(int row, int col, boolean[][] ocean) {
		// TODO 自动生成的方法存根
		if(ocean[row][col]) return;
		ocean[row][col] = true;
		for(int[] dic : dict) {
			int newRow = row + dic[0];
			int newCol = col + dic[1];
			if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && 
					(heights[newRow][newCol] >= heights[row][col])) {
				dfs(newRow, newCol, ocean);
			}
		}
	}
}
