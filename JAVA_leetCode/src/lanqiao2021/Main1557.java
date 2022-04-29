package lanqiao2021;

public class Main1557 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long N = 1000000007 ;
		long M = 999999999;
		for(int i=1;i<2021;i++) {
			if((i*N+M) % 2021 ==0 ) {
				System.out.println((i*N+M)/2021);
			}
		}
	}

}
