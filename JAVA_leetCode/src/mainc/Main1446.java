package mainc;

import java.util.Arrays;
import java.util.Scanner;

public class Main1446 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int [] list = new int [3];
		for(int i=0;i<3;i++) {
			list[i] = scanner.nextInt();
		}
		
		int minSum = 0;
		int a = list[0], b = list[1] , c = list[2];
		
		minSum = lcm(a, lcm(c, b));
		
		System.out.println(minSum);
	}
	public static int gcd(int a,int b) {
		return b==0 ? a : gcd(b, a%b);
	}
	public static int lcm(int a,int b) {
		return a*b/gcd(a, b);
	}

}
