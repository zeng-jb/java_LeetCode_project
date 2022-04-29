package leet;

public class Leet0172 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	 * ��׳˺��0
	 * β0������2*5=10�����ģ���5�����ӱȽ��٣����ֻҪ��5�����Ӽ���
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
