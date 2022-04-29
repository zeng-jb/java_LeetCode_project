/**
 * 
 */
package leet;

import java.util.ArrayList;

/**
 * @author 123
 *
 */
public class Leet1078 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String text = "alice is a good girl she is a good student", first = "a", second = "good";
//		String text = "we will we will rock you", first = "we", second = "will";
//		String text = "we we we we will rock you",first = "we",second = "we";
		String[] ans = findOcurrences(text,first,second);
		for (int i = 0; i < ans.length; i++) {
			String string = ans[i];
			System.out.println(string);
		}
	}

   	public static String[] findOcurrences(String text, String first, String second) {
		String[] ans = new String[300];
		int flag = 0;
		String[] str = text.split(" ");
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			
//			String string = str[i];
//			if(string.equals(first) && flag!=1) {
//				flag = 1;
//			}
//			else if(string.equals(second) && flag ==1 && i+1 < str.length) {
//				ans[index++] = str[i+1];
//                flag = 0;
//			}else {
//				flag = 0;
//			}
			if(str[i].equals(first) && i+2 <str.length) {
				if(str[i+1].equals(second))
					ans[index++] = str[i+2];
			}
			
		}
		
		String []a = new String[index];
		for (int i = 0; i < index; i++) {
			a[i] = ans[i];
		}
		return a;
    }
}
