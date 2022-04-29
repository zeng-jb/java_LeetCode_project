/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Main1084 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		int [] primenum = Prime(num);
//		
//		for (int i : primenum ) {
//			if(i!=0)
//				System.out.println(i);
//		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+b);
		
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			if(num<1) break;
			boolean isPrime = isPrime(num);
			if(isPrime) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}
	
	public static int [] Prime(int num) {
		int []primenum= new int [100];
		int cnt = 0;
		for(int i=0;i<=num;i++) {
			if(isPrime(i))
				primenum[cnt++] = i;
		}
		return primenum;
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		if(num==0 || num==1 || (num%2==0 && num!=2)) {
			isPrime = false;
		}
		else {
			for(int i=3;i<=Math.sqrt(num);i+=2) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		return isPrime;
	}

}
