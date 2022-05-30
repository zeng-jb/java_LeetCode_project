package leet;

import java.util.Arrays;
import java.util.stream.Stream;

public class Leet467 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String  p = "zab";
		Leet467 obj = new Leet467();
		System.out.println(obj.findSubstringInWraproundString(p));
	}

	
	public int findSubstringInWraproundString(String p) {
		int[] dp = new int[26];
		int k = 0;
		for(int i=0;i<p.length();i++) {
			if(i > 0 && (p.charAt(i) - p.charAt(i-1) + 26) % 26 == 1) {
				//字符之差为1或者-25
				k++;
			}else {
				k = 1;
			}
			dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], k);
		}
		return Arrays.stream(dp).sum();
    }
}
