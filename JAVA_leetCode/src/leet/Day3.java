package leet;


import java.util.ArrayList;

public class Day3 {
	private static int[][] colorBorder(int [][] grid,int row ,int col,int color){
		int m = grid.length;
		int n = grid[0].length;
		boolean [][] visited = new boolean[m][n];
		ArrayList<int[]> borders = new ArrayList<>();
		int originalColor = grid[row][col];
		visited[row][col] = true;
		dfs(grid,row,col,visited,borders,originalColor);
		for (int i = 0; i < borders.size(); i++) {
			int x = borders.get(i)[0] , y = borders.get(i)[1];
			grid[x][y] = color;
			
		}
		
		
		return grid;
	}
	
	private static void dfs(int [][] grid,int x,int y,boolean[][] visited,ArrayList<int[]> borders,int originalColor) {
		int m = grid.length , n = grid[0].length;
		boolean isBorder = false;
		int [][] direc = {{0,1},{0,-1},{1,0},{-1,0}};
		for(int i=0;i<4;i++) {
			int nx = x + direc[i][0] , ny = y + direc[i][1];
			if (!(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]==originalColor)) {
				isBorder = true;
			}else if (!visited[nx][ny]) {
				visited[nx][ny]=true;
				dfs(grid, nx, ny, visited, borders, originalColor);
			}
		}
		if (isBorder) {
			borders.add(new int [] {x,y});
		}
	}
	public static void main(String args[]) {
		int grid[][] = {{1,1},{1,2}};
		int row = 0;
		int col = 0;
		int color = 3;
//		int grid[][] = {{1,2,2},{2,3,2}};
//		int row = 0;
//		int col = 1;
//		int color = 3;
//		int grid[][] = {{1,1,1},{1,1,1},{1,1,1}};
//		int row = 1;
//		int col = 1;
//		int color = 2;
		int[][] g =  colorBorder(grid,row,col,color);
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				System.out.print(g[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
