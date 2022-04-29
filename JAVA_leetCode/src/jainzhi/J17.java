package jainzhi;

public class J17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 3;
		System.out.println(printNumbers(n));
	}
	
	public static int[] printNumbers(int n) {
		int num = (int) Math.pow(10, n);
		int[] res = new int[num-1];
		for(int i=1;i<num;i++) {
			res[i-1] = i;
		}
		
		return res;
    }
}
