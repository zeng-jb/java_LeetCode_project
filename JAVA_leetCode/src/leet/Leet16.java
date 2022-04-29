/**
 * 
 */
package leet;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Leet16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		//String[] str = {"flower","flow","flight"};
		String[] str = {"dog","racecar","car"};
		
		Arrays.sort(str);
		String s = str[0];
		for (int i = 1; i < str.length; i++) {
			String string = str[i];
			while (!string.startsWith(s)) {
				if (s.length() == 0) {
					s = "";
				}
				s = s.substring(0,s.length()-1);
				
			}
			
		}
		System.out.println(s);
	}

}
