package mainc;

import java.util.Scanner;

public class Main1443 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int T = scanner.nextInt();
		System.out.println(countDD1(n, k, T));
	}
	
	public static int countDD(int n,int k,int T) {
		int sum = 1;
		int index = 0;
		int sum1 = 1;
		while(--T>0) {
			
			for(int i=0;i<n;i++) {
				sum1 += index;
				if(sum1>k) sum1 %= k;
				index++;
			}
			sum += (sum1+index)%k;
		}
		
		return sum;
	}
	
	public static long countDD1(int n,int k,int T) {
		long sum = 1;
		long t = 1;
		long a = 1;
		
		for(int i=1;i<T;i++) {
			
			
			t = (((a+a+n-1)*n/2)+t)%k;
			sum+=t;
			a += n;
		}
		
		return sum;
	}
}
