package mainc;

import java.util.Scanner;

public class Main1434 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		huiwen2(n);
		
	}
	public static void huiwen1(int n) {
		
		boolean flag = false;
		
		//��λ�Ļ�����
		for(int i=1;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					if(i+j+k+j+i == n) {
						flag = true;
						System.out.println(String.format("%d%d%d%d%d", i,j,k,j,i));
					}
				}
			}
		}
		//��λ�Ļ�������ֻ��nΪż������
		if(n%2==0) {
			for(int i=1;i<10;i++) {
				for(int j=0;j<10;j++) {
					for(int k=0;k<10;k++) {
						if(i+j+k == n/2) {
							flag = true;
							System.out.println(String.format("%d%d%d%d%d%d", i,j,k,k,j,i));
						}
					}
				}
			}
		}
		
		if(!flag) {
			System.out.println(-1);
		}
	}

	public static void huiwen2(int n) {
		boolean flag = false;
		//��10000��1000000����
		for(int i=10000;i<1000000;i++) {
			int t = i, num = 0 ,sum = 0;
			while(t>0) {
				num = num*10+t%10;
				sum+=t%10;
				t = t/10;
			}
			if(num == i && sum == n) {
				flag=true;
				System.out.println(i);
			}
		}
		
		if(!flag) {
			System.out.println(-1);
		}
	}
}
