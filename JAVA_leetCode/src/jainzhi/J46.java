package jainzhi;

public class J46 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		//从数字地位开始处理
		if(num <= 9) return 1;
		int ba = num%100;
		//如果ba不在10到25之间，比如58显然需要再分，此时只有一种解法
		if(ba <= 9 || ba >= 26) return translateNum(num/10);
		else {
			//如果在返回两种解法
			return translateNum(num/10) + translateNum(num/100);
		}
    }
}
