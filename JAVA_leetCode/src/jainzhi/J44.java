package jainzhi;

public class J44 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		J44 obJ44 = new J44();
		int n = 1000000000;
		int ans = obJ44.findNthDigit(n);
		System.out.println(ans);
	}
	
	public int findNthDigit(int n) {
		/* 数字范围    数量  位数    占多少位
	    1-9        9      1       9
	    10-99      90     2       180
	    100-999    900    3       2700
	    1000-9999  9000   4       36000  ...

	    例如 2901 = 9 + 180 + 2700 + 12 即一定是4位数,第12位   n = 12;
	    数据为 = 1000 + (12 - 1)/ 4  = 1000 + 2 = 1002
	    定位1002中的位置 = (n - 1) %  4 = 3    s.charAt(3) = 2;
	*/
		long start = 1;	//开始数字，这里为1，注意题目要求0开始，因此后面求到的n需要-1
		long count = 9;	//当前位数的数量
		int digit = 1;	//当前的位数
		
		while(count < n) {
			n -= count;
			digit++;
			start *= 10;
			count = digit*start*9;
		}
		long num = start + (n-1)/digit;
		int ans = Long.toString(num).charAt((n-1)%digit)-'0';
		return ans;
    }
}
