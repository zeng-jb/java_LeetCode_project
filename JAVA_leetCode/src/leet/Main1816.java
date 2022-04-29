package leet;

import java.util.Scanner;

public class Main1816 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string;
		int k;
		string = scanner.nextLine();
		k = scanner.nextInt();
		String [] strings = string.split(" ");
		for (int i = 0; i < k; i++) {
			System.out.print(strings[i]+" ");
			
		}
		System.out.println();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ' && --k == 0) {
				System.out.println(string.substring(0, i));
			}
			
		}
		
		scanner.close();
	}
}
