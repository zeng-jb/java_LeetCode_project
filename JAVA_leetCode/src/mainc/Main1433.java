package mainc;

import java.util.Scanner;

public class Main1433 {
	static int[][]a = new int[1005][1005];//��ʾ�ڽӾ���
	static int[]b = new int[1005];	//��ʾ�ɹ�·���У������ĵ������
	static boolean []vis = new boolean[1005];	//�ý���Ƿ񱻷���
	static Scanner scanner = new Scanner(System.in);
	static int n,m,u,v,ans=0;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
			//û��ͨ·�����-1
		}else {
			for(int i=1;i<=n;i++) {
				if(b[i] == ans && i!=u && i!=v) {
					cnt++;//�ؼ���ͳ�ƶ��ٸ�
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void dfs(int u,int v) {
		if(u == v) {
			ans++;	//ͨ·��1
			for(int i=1;i<=n;i++) {
				if(i!=u && i!=v && vis[i]) b[i]++;
			}
			return ;
		}
		for(int i=1;i<=n;i++) {
			if(a[u][i]==1 && !vis[i]) {
				vis[u] = true;	//��־�������Ѿ����ʹ�
				dfs(i, v);
				vis[u] = false;	//���û�з��ʣ����ݲ������ʣ�
			}
		}
	}
}
