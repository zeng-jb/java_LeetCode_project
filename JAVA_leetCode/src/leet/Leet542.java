package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet542 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Solution1 obj = new Solution1();
		int [][] mat = {{0,0,0},{0,1,0},{1,1,1}};
		System.out.println(obj.updateMatrix(mat));
	}

}

 class Solution1 {
    public int[][] updateMatrix(int[][] mat) {
    	int m = mat.length;
    	int n = mat[0].length;
    	int [][]ans = new int[m][n];
    	boolean visited[][] =new boolean[m][n];
    	Deque<int[]> deque = new ArrayDeque<>();
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(mat[i][j] == 0) {
    				deque.addLast(new int[] {i,j});
    				visited[i][j] = true;
    			}
    		}
    	}
    	int [][]dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
    	while(!deque.isEmpty()) {
    		int []temp = deque.poll();
    		for (int[] di : dir) {
				int x = temp[0] + di[0];
				int y = temp[1] + di[1];
				if(x<0 || x>=m || y<0 || y>=n || visited[x][y]) continue;
				ans[x][y] = ans[temp[0]][temp[1]] + 1;
				visited[x][y] = true;
				deque.add(new int[] {x,y});
			}
    	}
    	
    	return ans;
    }
}