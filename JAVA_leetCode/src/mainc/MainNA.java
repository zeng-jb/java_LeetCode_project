/**
 * 
 */
package mainc;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 123
 *
 */
public class MainNA {

	/**
	 * @param args
	 */
	
	static Scanner scanner = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		


		int n = scanner.nextInt();
		long c = scanner.nextLong();
		
		long []level = new long[n];
		
		for(int i=0;i<n;i++) {
			level[i] = scanner.nextLong();
		}
		
		Arrays.sort(level);
		
		for(int j = 0;j<n;j++) {
			if(c > level[j]) {
				c += level[j];
			}else
				break;
		}
		
		System.out.println(c);
//		out.println(c);
//		out.flush();
//		out.close();
		
		
		/*
		BigInteger n ,c;
		String s1 = scanner.nextLine();
		String st[] = s1.split(" ");
		n = BigInteger.valueOf(Long.parseLong(st[0]));
		c = BigInteger.valueOf(Long.parseLong(st[1]));
		
		BigInteger []level = new BigInteger[Integer.parseInt(n.toString())];
		
		String str = scanner.nextLine();
		String s[] = str.split(" ");
		for(int i=0;i<level.length;i++) {
			level[i] = BigInteger.valueOf(Long.parseLong(s[i]));
		}
		Arrays.sort(level);
		
		BigInteger C ;
//		C = BigInteger.valueOf(Long.parseLong(Integer.toString(c)));
		for(int i=0;i<level.length;i++) {
			if(c.compareTo( level[i]) >= 0) {
				c = c.add(level[i]);
			}else {
				break;
			}
		}
		
		System.out.println(c);
		
		/*
		while (scanner.hasNext()) {
			String string = (String) scanner.nextLine();
			BigInteger bi = new BigInteger("0");
			for(int i=0;i<string.length();i++) {
				bi = bi.add(BigInteger.valueOf(string.charAt(i)-48));
			}
			System.out.println(bi);
		}
		*/
		
	}

}
