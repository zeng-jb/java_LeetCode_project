package leet;

import java.util.Arrays;
import java.util.Scanner;

public class Main1427 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a*b-a-b);
		
//		int [] numCount = new int[100000];
//		Arrays.fill(numCount, 0);
//		int ant = 0;
//		numCount[a] = numCount[b] = 1;
//		int i = 0;
//		for(i=0;ant<10000;i++) {
//			if(numCount[i]==1) {
//				numCount[i+a] = numCount[i+b] = 1;
//				ant++;
//			}else {
//				ant=0;
//			}
//			
//		}
//		System.out.println(i-ant-1);
	}

}
