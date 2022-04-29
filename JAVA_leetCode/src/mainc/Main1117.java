package mainc;

import java.util.Scanner;

public class Main1117 {

	public static int N , K , SUM = 0;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		N = n ; K = k;
		dfs(1, 1);
		System.out.println(SUM);
	}
	
	public static void dfs(int length ,int step) {
		int [] next = {1 , 2};
		
		if(length == N) {
			SUM+=Math.pow(K-1, step);
			return;
		}
		if(length == N+1) {
			SUM+=Math.pow(K-1, step-1);
			return;
		}
		
		for(int i = 0;i<next.length;i++) {
			int tlength = length + next[i];
			dfs(tlength, step+1);
		}
	}

}
