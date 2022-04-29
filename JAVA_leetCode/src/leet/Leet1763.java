package leet;

public class Leet1763 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "YazaAay";
		System.out.println(longestNiceSubstring(s));
	}
	public static String longestNiceSubstring(String s) {
		int start = 0;
		int end = -1;
		int n = s.length();
		for(int i=0;i<n;i++) {
			int lower = 0;
			int upper = 0;
			for(int j=i;j<n;j++) {
				if(Character.isLowerCase(s.charAt(j))) {
					lower |= 1 << (s.charAt(j)-'a');
				}else {
					upper |= 1 << (s.charAt(j)-'A');
				}
				if(lower == upper && j-i>end-start) {
					start = i;
					end = j;
				}
			}
		}
		return s.substring(start,end+1);
	}
}
