package leet;

public class Leet357 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n = 3;
		Leet357 obj = new Leet357();
		System.out.println(obj.countNumbersWithUniqueDigits(n));
	}

	//��ѧ������f(k) = 9*9*8***(9-k+2);
	public int countNumbersWithUniqueDigits1(int n) {
		int sum = 0;
		if(n == 0) return 1;
		while(n > 0) {
			sum += f(n);
			n--;
		}
		
		return sum;
    }

	private int f(int k) {
		// TODO �Զ����ɵķ������
		if(k==1) return 10;
		int count = 9;
		int index = 9;
		int end = 9 - k + 2;
		while(index >= end) {
			count *= index;
			index--;
		}
		return count;
	}
	//��̬�滮
	public int countNumbersWithUniqueDigits(int n) {
		if(n==0) return 1;
		int []dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 10;
		for(int i=2;i<=n;i++) {
			//��ǰλ���Ĳ�ͬ���ֵ���ǰһλ�Ĳ�ͬ���ֺ�+������ĵ�ǰΪ���ͣ����� dp[3] = 739 = 91 + (91-10)*(10-3+1��
			dp[i] = dp[i-1] + (dp[i-1] - dp[i-2])*(10-i+1);
		}
		return dp[n];
	}
}
