package leet;

public class Leet1688 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n =14;
		System.out.println(numberOfMatches(n));
	}
	public static int numberOfMatches(int n) {
		int match = 0;
		int team = n;
		while(n>1) {
			if(n%2==0) {
				match += n/2;
				team = n/2;
			}else {
				match += (n-1)/2;
				team = (n-1)/2+1;
			}
			n = team;
		}
		
		return match;
    }
}
