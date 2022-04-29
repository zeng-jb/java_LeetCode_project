package lanqiao2021;

public class Main1552 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long n = 2021041820210418L ;
		long ant[] = new long[3000];
		int cnt = 0;
		
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n % i ==0) {
				ant[++cnt] = i;
				if(i * i != n) {
					ant[++cnt] = (n/i);
				}
			}
		}
		int res = 0;
		for(int l=1;l<=cnt;l++) {
			for(int w=1;w<=cnt;w++) {
				for(int h=1;h<=cnt;h++) {
					if(ant[l]*ant[w]*ant[h] == n) res++;
				}
			}
		}
		System.out.println(res);
	}

}
