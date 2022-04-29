package leet;

public class Leet258 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 98;
		System.out.println(addDigits(num));
	}

	//循环解法，求树根。
	public static int addDigits1(int num) {
		while(num >= 10) {
			int sum = 0;
			while(num != 0) {				
				sum += num %10;
				num /= 10;
			}
			num = sum;
		}
		return num;
    }
	
	//数学求数根
	public static int addDigits(int num) {
		if(num == 0) {
			return 0;
		}
		//如果这个数可以整除9 ， 那么它的数位和取余一定返回9；
		if(num % 9 == 0) {
			return 9;
		}
		//如果不可以整除9，那么它的数位和取余9就是他本身取余9；
		return num % 9;
	}
	
}
