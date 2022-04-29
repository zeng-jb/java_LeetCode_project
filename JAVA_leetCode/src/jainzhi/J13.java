package jainzhi;

import java.util.ArrayDeque;
import java.util.Deque;

public class J13 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int m = 7, n = 2, k = 3;
		System.out.println(movingCount1(m, n, k));
	}
	
	//���Ʒ��������º�������
	public static int movingCount(int m, int n, int k) {
		int ans = 1;
		boolean [][] vis = new boolean[m][n];
		vis[0][0] = true;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j==0) || get(i) + get(j) > k) {
					continue;
				}
				if(i-1>=0) {
					vis[i][j] |= vis[i-1][j];
				}
				if(j-1>=0) {
					vis[i][j] |= vis[i][j-1];
				}
				ans += vis[i][j] ? 1 : 0;
			}
		}
		
		return ans;
    }
	
	//BFS
	public static int movingCount1(int m, int n, int k) {
		int ans = 1;
		boolean [][] vis = new boolean[m][n];
		vis[0][0] = true;
		Deque<int[]> deque = new ArrayDeque<>();
		deque.addLast(new int[] {0,0});
		int dirs[][] = {{1,0},{0,1}};
		
		while(!deque.isEmpty()) {
			int []temp = deque.poll();
			for(int[]dir : dirs) {
				int x = temp[0] + dir[0];
				int y = temp[1] + dir[1];
				if(x<0 || x>=m || y<0 || y>=n || vis[x][y] || (get(x)+get(y)>k)) continue;
				deque.addLast(new int[] {x,y});
				vis[x][y] = true;
				ans++;
			}
			
		}
		return ans;
    }
	//��ȡ��λ��
	private static int get(int x) {
		int res = 0;
		while(x > 0) {
			res+=x%10;
			x /= 10;
		}
		return res;
	}
}
