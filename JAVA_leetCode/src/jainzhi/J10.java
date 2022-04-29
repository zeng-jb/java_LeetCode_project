package jainzhi;

public class J10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n =48;
		System.out.println(numWays(n));
	}
	
	public static int numWays(int n) {
		if(n==0) return 1;
		if(n==2 || n==1) return n;
		int a = 1,b=2;
		for(int i=3;i<=n;i++) {
			int temp = a;
			if(temp>1000000007) temp-=1000000007;
			a = b;
			b = b+temp;
			if(b>1000000007) b-=1000000007;
		}
		return b;
    }
}
