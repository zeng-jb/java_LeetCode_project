package lanqiao2021;

public class Main1553 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int f[] = new int[2050];
		for(int i=1;i<=2021;i++) {
			for(int j=i+1;j<=i+21;j++) {
				if(f[j] == 0) {
					f[j] = f[i] + lcm(i, j);
				}else {
					f[j] = Math.min(f[j], f[i]+lcm(i, j));
				}
			}
		}
		System.out.println(f[2021]);
	}

	public static int gcd(int a ,int b) {
		return b==0 ? a : gcd(b, a%b);
	}
	public static int lcm(int a,int b) {
		return (a*b) / gcd(a, b);
	}
}
