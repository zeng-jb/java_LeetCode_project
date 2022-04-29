package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet1926 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[][]maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
		int[] entrance = {1,2};
		System.out.println(nearestExit(maze, entrance));

	}

	public static int nearestExit(char[][] maze, int[] entrance) {
		int ans = -1;
		int m = maze.length;
		int n = maze[0].length;
		int dirs[][] = {{0,1},{0,-1},{1,0},{-1,0}};
		boolean [][]vis = new boolean[m][n];
		Deque<int[]> q = new ArrayDeque<>();
		vis[entrance[0]][entrance[1]] = true;
		q.add(new int[] {entrance[0],entrance[1]});
		while(!q.isEmpty()) {
			int size = q.size();
			ans++;
			for(int i=0;i<size;i++) {
				int []temp = q.poll();
				if((temp[0]!=entrance[0] || temp[1]!=entrance[1]) && (temp[0]==0 || temp[0]==n-1 || temp[1]==0 || temp[1]==m-1 )) {
					return ans;
				}
				for(int[] dir : dirs) {
					int x = temp[0] + dir[0];
					int y = temp[1] + dir[1];
					if(x<0 || x>=m || y<0 || y>=n || maze[x][y]=='+' || vis[x][y]) continue;
					q.add(new int[] {x,y});
					vis[x][y] = true;
				}
			}
		}
		
		
		return -1;
    }
	
	
}
