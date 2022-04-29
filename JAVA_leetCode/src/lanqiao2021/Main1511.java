package lanqiao2021;

public class Main1511 {

	static int N = 20;
	static boolean[] use = new boolean[N];
	static int ans = 0;
	static int[][] e = new int[N][N];
	static int[] fa = new int[N];
	
	static void init() {
		/*	
		连边建图，e[i][j] == 1表示第i段和第j段灯管相邻
		a b c d e f g
		1 2 3 4 5 6 7
	*/
		e[1][2] = e[1][6] = 1;
		e[2][1] = e[2][7] = e[2][3] = 1;
		e[3][2] = e[3][4] = e[3][7] = 1;
		e[4][3] = e[4][5] = 1;
		e[5][4] = e[5][6] = e[5][7] = 1;
		e[6][1] = e[6][5] = e[6][7] = 1;
		e[7][2] = e[7][3] = e[7][5] = e[7][6] = 1;
	}
	//并查集
	static int find(int u) {
		if(fa[u] == u) {
			return u;
		}
		fa[u] = find(fa[u]);
		return fa[u];
	}

	static void dfs(int d) {
		if(d>7) {
		//判断并查集是否都在一个集合上
			for(int i=1;i<=7;i++) {
				fa[i] = i;		//初始化并查集
			}
			//遍历这个边集
			for(int i=1;i<=7;i++) {		
				for(int j=1;j<=7;j++) {
					if(e[i][j] == 1 && use[i] && use[j]) {		//如果这两条边是相邻的且都是亮着的
						int fx = find(i);
						int fy = find(j);
						if(fx != fy) {
							fa[fx] = fy;	//如果不在同一个集合就合并
						}
					}
				}
			}
			
			int k=0;
			for(int i=1;i<=7;i++) {
				if(use[i] && fa[i] == i) k++;
			}
			if(k == 1) {
				ans++;	//如果所有亮灯的都属于同一个集合的话
			}
			return;
		}	
		
		use[d] = true;	//将这灯亮
		dfs(d+1);
		use[d] = false;//暗
		dfs(d+1);
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		init();
		dfs(1);
		System.out.println(ans);
	}

}
