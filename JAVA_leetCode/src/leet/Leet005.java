package leet;

public class Leet005 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "cbbd";
		System.out.println(longestPalindrome(s));
	}

	
	/*
	 * 暴搜
	 */
	public static String longestPalindrome1(String s) {
		int len = s.length();
		String ans = "";
		int max = 0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len+1;j++) {
				String test = s.substring(i,j);
				if(isPalindrome(test) && test.length()>max) {
					ans = test;
					max = Math.max(max, test.length());
				}
			}
		}
		return ans;
    }

	private static boolean isPalindrome(String test) {
		// TODO 自动生成的方法存根
		int len = test.length();
		for(int i=0;i<len/2;i++) {
			if(test.charAt(i) != test.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * 中心扩散
	 */
	public static String longestPalindrome2(String s) {
		if(s == null || s.length() ==0) return "";
		int left , right;
		int len = 1;
		int strLen = s.length();
		int maxStart = 0 ,maxLen = 0;
		
		for(int i=0;i<strLen;i++) {
			left = i-1;
			right = i+1;
			//往左扩散
			while(left>=0 && s.charAt(left) == s.charAt(i)) {
				len++;
				left--;
			}
			//往右扩散
			while(right<strLen && s.charAt(right) == s.charAt(i)) {
				len++;
				right++;
			}
			//同时往两边扩散
			while(left>=0 && right<strLen && s.charAt(left) == s.charAt(right)) {
				len +=2;
				left--;
				right++;
			}
			
			if(len>maxLen) {
				maxLen = len;
				maxStart = left;
			}
			len = 1;
		}
		
		return s.substring(maxStart+1,maxStart+maxLen+1);
	}
	
	/*
	 * 动态规划
	 */
	public static String longestPalindrome(String s) {
		if(s == null || s.length()<2) return s;
		int strLen = s.length();
		int maxStart = 0 , maxEnd = 0;	//起始回文，终止回文下标
		int maxLen = 1;	//回文长度
		
		boolean dp[][] = new boolean[strLen][strLen];
		
		for(int r=1;r<strLen;r++) {
			for(int l=0;l<r;l++) {
				//要判断是l和r所在是相同的，并且dp[l+1][r-1]为true的时候dp[l][r]才为true
				if(s.charAt(l) == s.charAt(r) && (r-l<=2 || dp[l+1][r-1] )) {
					dp[l][r] = true;
					if(r-l+1 > maxLen) {
						maxLen = r-l+1;
						maxStart = l;
						maxEnd = r;
					}
				}
			}
		}
		
		return s.substring(maxStart,maxEnd+1);
	}
}
