package mainc;

import java.util.Scanner;

public class Main1431 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = scanner.nextInt();
		int []childen = new int[n];
		for(int i=0;i<n;i++) {
			childen[i] = scanner.nextInt();
		}
		System.out.println(diff(childen));
	}
	
	public static int diff(int[] childen) {
		int ans = 0;
		int first = childen[0];
		int size = childen.length;
		int [] half = new int[size];
		boolean flag = false;
		while(!flag) {
			for(int i=0;i<size;i++) {
				int a = childen[i] /2;
				half[(i+size-1)%size] = a;
				childen[i] = a;
			}
			for(int i=0;i<size;i++) {
				childen[i] = childen[i] + half[i];
				if(childen[i]%2==1) {
					childen[i]++;
					ans++;
				}
			}
			first = childen[0];
			for(int i=0;i<size;i++) {
				if(first != childen[i]) {
					flag = false;
					break;
				}
				flag = true;
			}
		}
		
		return ans;
	}
}
