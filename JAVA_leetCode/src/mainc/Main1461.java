package mainc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1461 {

	/*
	FJ在沙盘上写了这样一些字符串：
	A1  =  “A”
	A2  =  “ABA”
	A3  =  “ABACABA”
	A4  =  “ABACABADABACABA”
	…  …
	你能找出其中的规律并写所有的数列AN吗？
	*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(FJString(n));
	}
	
	public static String FJString(int n) {
		List<String> list = new ArrayList<>();
		list.add("A");
		for(int i=1;i<n;i++) {
			list.add(list.get(i-1) + (char)('A'+i) + list.get(i-1));
		}
		return list.get(n-1);
	}
}
