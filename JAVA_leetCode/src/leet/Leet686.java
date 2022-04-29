/**
 * 
 */
package leet;

/**
 * @author 123
 *
 */
public class Leet686 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = "abcd", b = "cdabcdab";
		System.out.println(repeatedStringMatch(a,b));
	}
	
	public static int repeatedStringMatch(String a, String b) {
		int lonth=0;
		
		StringBuilder sb = new StringBuilder();
		int m = a.length() , n = b.length();
		
		while(sb.length() < n && ++lonth > 0) sb.append(a);
		sb.append(a);
		int idx = sb.indexOf(b);
		if(idx == -1) return -1;
		
		if(idx + n > m*lonth)
			lonth++;
		
		return lonth;
    }

}
