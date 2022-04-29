package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet838 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String dominoes = ".L.R...LR..L..";
		System.out.println(pushDominoes(dominoes));
	}

	public static String pushDominoes(String dominoes) {
		char []cs = dominoes.toCharArray();
		int n = cs.length;
		Deque<int[]> q = new ArrayDeque<>();
		int[] g = new int[n];
		for(int i=0;i<n;i++) {
			if(cs[i] == '.') continue;
			int dire = cs[i]=='L' ? -1 : 1;
			q.add(new int[] {i,1,dire});
			g[i] = 1;
		}
		
		while(!q.isEmpty()) {
			int[] info = q.pollFirst();
			int loc = info[0] , time = info[1] , dire = info[2];
			int ne = loc + dire;
			if(cs[loc] == '.' || (ne<0 || ne >=n)) continue;
			if(g[ne] == 0) {
				//�״�����
				q.addLast(new int[] {ne,time+1,dire});
				g[ne] = time +1;
				cs[ne] = dire == -1 ? 'L' : 'R';
			}else if(g[ne] == time +1) {
				//�������
				cs[ne] = '.';
			}
		}
		
		
		return String.valueOf(cs);
    }
}
