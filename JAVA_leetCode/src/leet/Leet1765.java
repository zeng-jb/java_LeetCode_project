package leet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Leet1765 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Solution obj = new Solution();
		int [][] isWater = {{0,0,1},{1,0,0},{0,0,0}};
		System.out.println(obj.highestPeak(isWater));
	}

}

class Solution {
    public int[][] highestPeak(int[][] isWater) {
    	int m = isWater.length;
    	int n = isWater[0].length;
    	int [][]ans = new int[m][n];
    	//Arrays.fill(ans, 0);
    	boolean [][] visited = new boolean[m][n];
    	//Arrays.fill(visited, false);
    	Deque<int[]> deque = new ArrayDeque<>();
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(isWater[i][j] == 1) {
    				visited[i][j] = true;
    				deque.addLast(new int[] {i,j});
    			}
    		}
    	}
    	int [][]dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
    	while(!deque.isEmpty()) {
    		int [] temp = deque.poll();
    		for(int i=0;i<4;i++) {
    			int x = temp[0] + dir[i][0];
    			int y = temp[1] + dir[i][1];
    			if(x<0 || x>=m || y<0 || y>=n || visited[x][y]) continue;
    			ans[x][y] = ans[temp[0]][temp[1]] + 1;
    			visited[x][y] = true;
    			deque.addLast(new int[] {x,y});
    		}
    	}
    	
    	return ans;
    }
}