package java_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_7_3 {
	public static void main(String args[]) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("请输入第一个整数：");
		int a=Integer.parseInt(f.readLine());
		System.out.print("请输入第二个整数：");
		int b=Integer.parseInt(f.readLine());
		System.out.println("计算结果："+a+"+"+b+"="+(a+b));
	}
}
