/**
 * 
 */
package leet;

import java.util.Arrays;

/**
 * @author 123
 *
 */
public class Leet748 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String licensePlate = "1s3 456";
		String[] words = {"looks", "pest", "stew", "show"};
		String str =  shortestCompletingWord(licensePlate,words);
		System.out.println(str);
	}

	public static String shortestCompletingWord(String licensePlate, String[] words) {
		String ans=null;
		
		int []licensePlatenum = count(licensePlate);
		for(String s:words) {
			int [] wordnum = count(s);
			boolean isok = true;
			for(int i=0;i<26 && isok ; i++) {
				if(licensePlatenum[i] > wordnum[i]) isok = false;
			}
			if(isok && (ans==null || ans.length()>s.length()))
				ans = s;
		}
		
		return ans;
    }
	
	public static int[] count(String s) {
		int [] letternum= new int[26] ;
		Arrays.fill(letternum, 0);
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)))
				letternum[s.charAt(i)-'a'] += 1; 
		}
		return letternum;
	}
}
