/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Main1115 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while(N-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			for(int i = 0;i<b;i++) {
				for(int j=0;j<a-1;j++) {
					for(int k = 0;k<a;k++) {
						if(k==j || k==a-j-1) {
							System.out.print("X");
						}else
							System.out.print(" ");
					}
					System.out.println();
				}
			}
			for(int k = 0;k<a;k++) {
				if(k==0 || k==a-1) {
					System.out.print("X");
				}else
					System.out.print(" ");
			}
			System.out.print("\n\n");
		}
	}

}
