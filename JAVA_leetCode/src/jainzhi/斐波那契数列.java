package jainzhi;

public class 斐波那契数列 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=20;
		System.out.println(fib1(n));
	}

	public static int fib(int n) {
		if(n<=1) return n;
		
		int first = 0;
		int second = 1;
		int result = 0;
		
		while(--n > 0) {
			result = first+second;
			if(result>1000000007) result-=1000000007;
			first = second;
			second = result;
		}
		
		return result;
    }
	
	public static int fib1(int n) {
		if(n<=1) return n;
		else {
			return fib1(n-1)%1000000007+fib1(n-2)%1000000007;
		}
		
	}
}
