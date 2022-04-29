package mainc;

import java.util.Scanner;

public class Main1433 {
	static int[][]a = new int[1005][1005];//表示邻接矩阵
	static int[]b = new int[1005];	//表示成功路径中，经过的点的数量
	static boolean []vis = new boolean[1005];	//该结点是否被访问
	static Scanner scanner = new Scanner(System.in);
	static int n,m,u,v,ans=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		n = scanner.nextInt();
		m = scanner.nextInt();
		for(int i=0;i<m;i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			a[x][y] = 1;
			a[y][x] = 1;
		}
		
		u = scanner.nextInt();
		v = scanner.nextInt();
		
		dfs(u, v);
		
		int cnt = 0;
		if(ans==0) {
			cnt = -1;
			//没有通路，输出-1
		}else {
			for(int i=1;i<=n;i++) {
				if(b[i] == ans && i!=u && i!=v) {
					cnt++;//关键点统计多少个
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void dfs(int u,int v) {
		if(u == v) {
			ans++;	//通路＋1
			for(int i=1;i<=n;i++) {
				if(i!=u && i!=v && vis[i]) b[i]++;
			}
			return ;
		}
		for(int i=1;i<=n;i++) {
			if(a[u][i]==1 && !vis[i]) {
				vis[u] = true;	//标志这个结点已经访问过
				dfs(i, v);
				vis[u] = false;	//如果没有访问，回溯并不访问，
			}
		}
	}
}
