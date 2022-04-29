package jainzhi;

import java.text.DecimalFormat;

public class J16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double x = 2.10000;
		int n = 3;
		System.out.println(myPow(x, n));
	}
	
	public static double myPow(double x, int n) {
		double ans = 1.0;
		long b = n;
		if(b<0) {
			x = 1/x;
			b = 0-b;
		}
		//快速幂，二进制，例如n=9的二进制为1001，那么x的9次方为:x^9 = x^(1*2^0) * x^(0*2^1) * x^(0*2^2) * x^(1*2^3)
		while(b > 0) {
			if((b&1)==1) ans *= x;
			x *= x;
			b >>= 1;
		}
		
		
		return ans;
	}
}
