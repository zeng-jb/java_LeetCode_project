package mainc;

import java.util.Scanner;

public class Main1447 {

	static Scanner scanner = new Scanner(System.in);
	static int m = 0;
	static long sum = 0;
	static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
	
	static int mod = 1000000007;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		m = scanner.nextInt();
		/**dfs会超时
		boolean [][]vis = new boolean[2][m];
		for(int i=0;i<2;i++) {
			for(int j=0;j<m;j++) {
				vis[i][j] = true;
				DFS(0,i,j,vis);
				vis[i][j] = false;
			}
		}
		*/
		dp();
		System.out.println(sum%mod);
	}
	
	private static void dp() {
		long [] a = new long[m+1];
		long [] b = new long[m+1];
		a[1] = 1; a[2] = 6; 
		b[1] = 1; b[2] = 2;
		
	    for (int i = 3; i <= m; i++)
	    {
	        b[i] = 2 * b[i - 1] % mod;
	        a[i] = ((2 * b[i - 1]) % mod + (4 * a[i - 2]) % mod + (2 * a[i - 1]) % mod) % mod;
	    }
	    for (int i = 2; i < m; i++)
	    {
	        sum += ((4 * b[m - i + 1] % mod * a[i - 1] % mod) % mod + (4 * b[i] % mod * a[m - i] % mod) % mod) % mod;
	    }
	    sum = (sum + ((a[m] * 4) % mod)) % mod;
	}
	
	private static void DFS(int count, int i, int j, boolean[][] vis) {
		// TODO 自动生成的方法存根
		if(count == 2*m-1) {
			sum++;
			if(sum==1000000007) sum = 0;
			return ;
		}
		
		for(int []dir : dirs) {
			int x = i + dir[0];
			int y = j + dir[1];
			if(x<0 || x>=2 || y<0 || y>=m || vis[x][y]) continue;
			vis[x][y] = true;
			DFS(count+1, x, y, vis);
			vis[x][y] = false;
		}
	}

	
}
