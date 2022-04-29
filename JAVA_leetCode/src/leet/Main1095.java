package leet;

import java.util.Scanner;

public class Main1095 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int count = 0;
			int startNum = scanner.nextInt();
			int endNum = scanner.nextInt();
			boolean flag = false;
			if(startNum>endNum) {
				flag = true;
				int a = startNum;
				startNum = endNum;
				endNum = a;
			}
			
			for(int i = startNum;i<=endNum;i++) {
				count = count > evenandodd(i) ? count : evenandodd(i);
			}
			if(flag) {
				int a = startNum;
				startNum = endNum;
				endNum = a;
			}
			System.out.println(startNum+" "+endNum+" "+count);
		}
	}
	
	public static int evenandodd(int num) {
		int count = 0;
		
		while (num!=1) {
			if(num%2==0) {
				num = num / 2;
			}else {
				num = 3*num + 1;
			}
			count++;
		}
		
		return ++count;
	}
}
