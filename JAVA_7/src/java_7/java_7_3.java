package java_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_7_3 {
	public static void main(String args[]) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�������һ��������");
		int a=Integer.parseInt(f.readLine());
		System.out.print("������ڶ���������");
		int b=Integer.parseInt(f.readLine());
		System.out.println("��������"+a+"+"+b+"="+(a+b));
	}
}
