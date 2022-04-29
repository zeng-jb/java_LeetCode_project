package leet;

public class Leet1414 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int k = 19;
		System.out.println(findMinFibonacciNumbers(k));
	}
	
	public static int findMinFibonacciNumbers(int k) {
		int count = 0;
		while(k!=0) {
			
			k -= Fibonacci(k);
			count++;
		}
		return count;
    }
	private static int Fibonacci(int k) {
		
		int f1 = 1;
		int f2 = 1;
		int fn = 0;
		while(fn<=k) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		
		return  f1;
	}
}
