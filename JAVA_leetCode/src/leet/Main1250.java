package leet;

import java.util.Scanner;

public class Main1250 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num =  scanner.nextInt();
			boolean flag = false;
			for(int i=1;i<=num;i++) {
				for(int j=i;i*i+j*j<=num;j++) {
					for(int k=j;i*i+j*j+k*k <= num;k++) {
						if(i*i+j*j+k*k == num) {
							flag = true;
							System.out.println(i+" "+j+" "+k);
						}
						
					}
				}
			}
			if(!flag)
				System.out.println("No Solution");
		}
	}

}
