package mainc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1487 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] letters = str.split(" ");
		Set<String> set = new HashSet<>();
		for (String letter : letters) {
			set.add(letter);
		}
		
		System.out.println(set.size());
	}

}
