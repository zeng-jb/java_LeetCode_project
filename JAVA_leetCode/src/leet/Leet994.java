package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet994 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int [][]grid = {{2,1,1},{1,1,0},{0,1,1}};
		int [][]grid = {{2,1,1},{0,1,1},{1,0,1}};
		System.out.println(orangesRotting(grid));
	}
	
	public static int orangesRotting(int[][] grid) {
		int minutes = 0,count = 0;
		int m = grid.length;
		int n = grid[0].length;
		boolean flagone = false;
		boolean visited[][] = new boolean[m][n];
		Deque<int[]> deque = new ArrayDeque<>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j] == 1) {
					count++;
					flagone = true;
				}
				if(grid[i][j] == 2) {
					deque.addLast(new int[] {i,j});
					visited[i][j] = true;
				}
			}
		}
		if(!flagone) return minutes;
		int [][]dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
		while(!deque.isEmpty() && count>0) {
			int size = deque.size();
			minutes++;
			for(int i=0;i<size;i++) {				
				int [] temp = deque.poll();
				for (int[] dir : dirs) {
					int x = temp[0] + dir[0];
					int y = temp[1] + dir[1];
					if(x<0 || x>=m || y<0 || y>=n || visited[x][y] || grid[x][y]==0) continue;
					grid[x][y] = grid[temp[0]][temp[1]];
					deque.addLast(new int[] {x,y});
					visited[x][y] = true;
					count--;
				}
			}
		}
		
		if(count>0) return -1;
		
		return minutes;
    }
}
