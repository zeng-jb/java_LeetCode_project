package jainzhi;

import java.util.HashSet;
import java.util.Set;

public class J48 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	
	public static int lengthOfLongestSubstring(String s) {
		int res = 0;
		int rk = -1;
		Set<Character> set = new HashSet<>();
		int n = s.length();
		for(int i=0;i<n;i++) {
			if(i!=0) {
				set.remove(s.charAt(i-1));
			}
			while(rk+1<n && !set.contains(s.charAt(rk+1))) {
				set.add(s.charAt(rk+1));
				++rk;
			}
			res = Math.max(res, rk-i+1);
		}
		return res;
    }
}
