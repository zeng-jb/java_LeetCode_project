package mainc;

import java.util.Scanner;

public class Main1432 {
	static Scanner scanner = new Scanner(System.in);
	static int [][]borad = new int[10][10];
	static int [][]flag = new int[10][10];
	static int [][]dict = {{-1,0},{1,0},{0,-1},{0,1}};
	static int result = 100000 ,n,m;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		m = scanner.nextInt();
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				borad[i][j] = scanner.nextInt();
			}
		}
		dfs(0, 0, 0);
		System.out.println(result);
	}

	public static void dfs(int x,int y,int sum) {
		sum = sum + borad[x][y];
		flag[x][y] = 1;
		int sum_other = 0;		//记录其他没有走的格子和
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(flag[i][j]==0) {
					sum_other+=borad[i][j];
				}
			}
		}
		//如果相等，记录走过的格子数
		if(sum_other == sum) {
			int ans = 0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(flag[i][j]==1) {
						ans++;
					}
				}
			}
			if(ans<result) {
				result = ans;
			}
			return;
		}
		//往4个方向走
		for(int i=0;i<4;i++) {
			int tx = x + dict[i][0];
			int ty = y + dict[i][1];
			if(tx<0 || tx>=n || ty<0 || ty>=m) continue;
			if(flag[tx][ty]!=1)	dfs(tx, ty, sum);
		}
		
		flag[x][y] = 0;	//如果4个方向都没有解，回退不访问。
	}
}
