package leet;

public class Leet521 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = "aa", b = "aaa";
		System.out.println(findLUSlength(a, b));
	}

	public static int findLUSlength(String a, String b) {
		if(a.equals(b)) {
			//如果a和b相等，那必然没有不相同的子序列
			return -1;
		}
		//长度比较长的字符串必不可能为短的子序列，因此只要返回长的字符串长度即可
		return Math.max(a.length(), b.length());
		
		//return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
