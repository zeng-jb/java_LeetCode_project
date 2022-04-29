package jainzhi;

public class J15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int n = -3;
		System.out.println(hammingWeight(n));
	}

	/**
	 * 计算无符号整数的二进制数位数为1的个数
	 * @param n	十进制数，注意java中没有无符号整数说法，int是32位的
	 * @return	位数为1的个数
	 */
	public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
        	//将n与－1之后相与，去掉了最低位的1，有多少个1就可以相与多少次
        	count++;
        	n &= n-1;
        }
//       return Integer.bitCount(n);   //库函数，计算一个数的二进制1的个数
        return count;
    }
	
	/**
	 * 当检查第 i 位时，我们可以让 n与 2^i进行与运算，当且仅当 n 的第 i 位为 1 时，运算结果不为 0。
	 * @param n
	 * @return
	 */
	   public int hammingWeight1(int n) {
	        int ret = 0;
	        for (int i = 0; i < 32; i++) {
	            if ((n & (1 << i)) != 0) {
	                ret++;
	            }
	        }
	        return ret;
	    }


}
