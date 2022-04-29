package lanqiao2021;

public class Main1511 {

	static int N = 20;
	static boolean[] use = new boolean[N];
	static int ans = 0;
	static int[][] e = new int[N][N];
	static int[] fa = new int[N];
	
	static void init() {
		/*	
		���߽�ͼ��e[i][j] == 1��ʾ��i�κ͵�j�εƹ�����
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
	//���鼯
	static int find(int u) {
		if(fa[u] == u) {
			return u;
		}
		fa[u] = find(fa[u]);
		return fa[u];
	}

	static void dfs(int d) {
		if(d>7) {
		//�жϲ��鼯�Ƿ���һ��������
			for(int i=1;i<=7;i++) {
				fa[i] = i;		//��ʼ�����鼯
			}
			//��������߼�
			for(int i=1;i<=7;i++) {		
				for(int j=1;j<=7;j++) {
					if(e[i][j] == 1 && use[i] && use[j]) {		//����������������ڵ��Ҷ������ŵ�
						int fx = find(i);
						int fy = find(j);
						if(fx != fy) {
							fa[fx] = fy;	//�������ͬһ�����Ͼͺϲ�
						}
					}
				}
			}
			
			int k=0;
			for(int i=1;i<=7;i++) {
				if(use[i] && fa[i] == i) k++;
			}
			if(k == 1) {
				ans++;	//����������ƵĶ�����ͬһ�����ϵĻ�
			}
			return;
		}	
		
		use[d] = true;	//�������
		dfs(d+1);
		use[d] = false;//��
		dfs(d+1);
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		init();
		dfs(1);
		System.out.println(ans);
	}

}
