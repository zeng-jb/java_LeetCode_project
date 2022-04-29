package lanqiao2021;

public class Main1509 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int ans = 0;
		for(int i=1;i<=2020;i++) {
			for(int j=1;j<=2020;j++) {
				if(gcd(i,j) == 1) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	private static int gcd(int a, int b) {
		// TODO 自动生成的方法存根
		return b==0 ? a : gcd(b, a%b);
	}

}
