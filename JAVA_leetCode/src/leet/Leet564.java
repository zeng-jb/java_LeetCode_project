package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet564 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "9876";
		System.out.println(nearestPalindromic(s));
	}

	
	/*
	 * 寻找最近的回文数
	 * 用原数的前半部分替换后半部分得到的回文整数。

		用原数的前半部分加一后的结果替换后半部分得到的回文整数。
		
		用原数的前半部分减一后的结果替换后半部分得到的回文整数。
		
		为防止位数变化导致构造的回文整数错误，因此直接构造 999\dots 999999…999 和 100\dots 001100…001 作为备选答案。

	 * 
	 * 
	 */
	public static String nearestPalindromic(String n) {
		long selfNumber = Long.parseLong(n) ,  ans = -1;
		
		List<Long> candidates = getCandidates(n);
		
		for(long candidate : candidates) {
			if(candidate != selfNumber) {
				if(ans == -1 ||
					Math.abs(candidate - selfNumber) < Math.abs(ans - selfNumber) ||
					Math.abs(candidate - selfNumber) == Math.abs(ans - selfNumber) && candidate < ans) {	//如果绝对值相等返回左边的
						ans = candidate;
				}
			}
		}
		return Long.toString(ans);
    }


	private static List<Long> getCandidates(String s) {
		// TODO 自动生成的方法存根
		int len = s.length();
		List<Long> candidates = new ArrayList<Long>() {
			{
				add((long)Math.pow(10, len-1) - 1);		//加入边界例如123的99 和 1001
				add((long)Math.pow(10, len) + 1);
			}
		};
		
		long selfPrefix = Long.parseLong(s.substring(0, (len+1)/2));	//这个数前一半
		for(long i=selfPrefix-1 ; i<= selfPrefix+1 ; i++) {
			//从这个数前一半的-1 `  +1找出回文。 
			StringBuilder sb = new StringBuilder();
			String prefix = String.valueOf(i);
			sb.append(prefix);
			
			StringBuilder suffix = new StringBuilder(prefix).reverse();
			//加入后缀，如果len长度为奇数那么起始子串为1，否则起始为0
			sb.append(suffix.substring(len & 1));
			
			String candidate = sb.toString();
			candidates.add(Long.parseLong(candidate));
		}
		
		return candidates;
	}
}
