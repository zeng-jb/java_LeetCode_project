package mainc;

import java.util.Arrays;
import java.util.Scanner;

public class MainPTA {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		D();
	}
	public static void A() {
		int age = scanner.nextInt();
		int year = scanner.nextInt();
		System.out.println(year+age-1);
	}
	
	public static void B() {
		int Y = 0;
		int N = 0;
		int t;
		while((t = scanner.nextInt())!=-1) {
			if(t == 1) Y++;
			else N++;
		}
		if(Y == N) {
			System.out.println("Tie");
		}else if(Y > N) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println(Y+":"+N);
	}
	public static void C() {
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int max = x > y ? x : y;
		if(x > 0 && y > 0) {
			System.out.println(max+" "+(x+y));
			System.out.println("^_^");
		}
		else if(x < 0 && y < 0) {
			System.out.println("0 0");
			System.out.println("-_-");
		}else {
			int t = x + y;
			if(t > 0) {
				System.out.println(max+" "+(t));
				System.out.println("^_^");
			}else if(t < 0){
				System.out.println(max+" 0");
				System.out.println("T_T");
			}else {
				System.out.println(max+" 0");
				System.out.println("-_-");
			}
		}
	}
	public static void D() {
		int n =scanner.nextInt();
		scanner.nextLine();
		String [] sm = new String[n];
		String [] sd = new String[3];
		for(int i = 0 ;i <n;i++) {
			sm[i] = scanner.nextLine();
		}
		for(int i = 0 ;i <3;i++) {
			sd[i] = scanner.nextLine();
		}
		int[] ans = new int[301];
		int z = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				for(int k=3;k>=0;k--) {
					if(sm[i].charAt(k) == sd[j].charAt(k)) {
						ans[z]++;
					}
				}
				z++;
			}
		}
		Arrays.sort(ans);
		int w = ans[300];
		StringBuilder str = new StringBuilder();
		switch(w) {
			case 0:
				 str.append( "WuDengJiang");
				break;
			case 1:
				str.append( "SiDengJiang");
				break;
			case 2:
				str.append("SanDengJiang");
				break;
			case 3:
				str.append( "ErDengJiang");
				break;
			case 4:
				str.append( "YiDengJiang!!!");
				break;
			default:
				break;
		}
		System.out.println(str);
	}
}
