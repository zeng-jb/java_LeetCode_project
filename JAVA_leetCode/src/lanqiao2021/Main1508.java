package lanqiao2021;

public class Main1508 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int ans = 0;
		for(int i=1;i<=2020;i++) {
			int num = i;
			while(num!=0) {
				int yu = num % 10;
				if(yu == 2) ans++;
				num = num / 10;
			}
		}
		System.out.println(ans);
	}

}
