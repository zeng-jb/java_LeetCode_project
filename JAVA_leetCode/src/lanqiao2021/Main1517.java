package lanqiao2021;

import java.util.Scanner;

public class Main1517 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = scanner.nextInt();
		int[] score = new int[n];
		for(int i=0;i<n;i++) {
			score[i] = scanner.nextInt();
		}
		
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		
		for(int i=1;i<n;i++) {
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
			sum += score[i];
		}
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(String.format("%.2f", sum*1.0/n));
	}

}
