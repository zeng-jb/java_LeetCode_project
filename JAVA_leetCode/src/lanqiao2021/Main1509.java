package lanqiao2021;

public class Main1509 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		return b==0 ? a : gcd(b, a%b);
	}

}
