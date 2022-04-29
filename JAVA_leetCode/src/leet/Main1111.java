/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Main1111 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		double w,h;
		w = scanner.nextInt();
		h = scanner.nextInt();
		while(w != 0 && h != 0) {
			double r1,r2;
			
			r1 = h/(2*(Math.PI+1));
			if(r1 > w/2) r1 = w/2;
			double v1 = Math.PI*r1*r1*w;
			r2 = w/(2*Math.PI);
			double v2 = Math.PI*r2*r2*(h-2*r2);
			if(v1>v2) {
				System.out.println(String.format("%.3f", v1));
			}else
				System.out.println(String.format("%.3f", v2));
			
			
			w = scanner.nextInt();
			h = scanner.nextInt();
		}
	}

}
