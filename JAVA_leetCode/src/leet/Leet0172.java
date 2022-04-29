package leet;

public class Leet0172 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 7;
		Leet0172 obj = new Leet0172();
		System.out.println(obj.trailingZeroes(n));
	}

	public int trailingZeroes1(int n) {
		long sum = 1;
		
		int ans = 0;
		
		for(int i=1;i<=n;i++) {
			sum *= i;
			while(sum % 10 == 0) {
				ans++;
				sum /= 10;
			}
			sum %= 100000;
		}
		return ans;
    }
	/**
	 * 求阶乘后的0
	 * 尾0都是由2*5=10得来的，而5的因子比较少，因此只要求5的因子即可
	 * @param n
	 * @return
	 */
	public int trailingZeroes2(int n) {
		int ans = 0;
		while(n != 0) {
			n /= 5;
			ans += n;
		}
		return ans;
	}
	public int trailingZeroes(int n) {
		return n==0 ? 0 : n/5 + trailingZeroes(n/5);
	}
}
