package jainzhi;

public class J46 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int num  = 12258;
		System.out.println(translateNum(num));
	}

	public static int translateNum1(int num) {
		String str = String.valueOf(num);
		int n = str.length();
		int [] dp = new int[n+1];
		dp[0] = 1 ; dp[1] = 1;
		for(int i=2;i<=n;i++) {
			String tmpStr = str.substring(i-2, i);
			if(tmpStr.compareTo("10") >= 0 && tmpStr.compareTo("25") <= 0) {
				dp[i] = dp[i-1] + dp[i-2];
			}else {
				dp[i] = dp[i-1];
			}
		}
		return dp[n];
    }
	
	public static int translateNum(int num) {
		//�����ֵ�λ��ʼ����
		if(num <= 9) return 1;
		int ba = num%100;
		//���ba����10��25֮�䣬����58��Ȼ��Ҫ�ٷ֣���ʱֻ��һ�ֽⷨ
		if(ba <= 9 || ba >= 26) return translateNum(num/10);
		else {
			//����ڷ������ֽⷨ
			return translateNum(num/10) + translateNum(num/100);
		}
    }
}
