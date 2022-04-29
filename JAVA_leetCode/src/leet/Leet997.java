/**
 * 
 */
package leet;

/**
 * @author 123
 *
 */
public class Leet997 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//int n=3;
		//int [][] trust =  {{1,3},{2,3},{3,1}}; 
		//System.out.println(findJudge(n, trust));
		
		int x = 10;
		System.out.println(isPalindrome(x));
	}
	public static int findJudge(int n, int[][] trust) {
		int ans = -1;
		int [] f1 = new int[n];
		int [] f2 = new int[n];
		for(int i=0;i<trust.length;i++) {
			f1[trust[i][0]-1]++;
			f2[trust[i][1]-1]++;
		}
		for(int i=0;i<n;i++) {
			if(f1[i]==0 && f2[i] == n-1) {
				ans = i+1;
			}
		}
		
		return ans;
    }

	 public static boolean isPalindrome(int x) {
		 boolean flag = false;
		 StringBuilder str = new StringBuilder(String.valueOf(x));
		 String str1 = String.valueOf(x);
		 String str2 = new String(str.reverse());
		 
		 //System.out.println(str);
		 //System.out.println(str1);
		 //System.out.println(str2);
		
		 if(str1.equals(str2))
			 flag = true;
		 
		 return flag;
	 }
}
