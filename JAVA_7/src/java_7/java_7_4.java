package java_7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class java_7_4 {
	public static void main(String args[]) throws IOException {		
		BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
		Scanner in=new Scanner(System.in);
		System.out.println("������5��ѧ���ĳɼ���");
		int c = 0;
		for(int i=0;i<5;i++) {
			c=in.nextInt();
			if(c<0||c>100) {
				System.out.print("�ɼ��������������루0~100����");
				c=in.nextInt();
			}
			bw.write(String.valueOf(c));
			bw.newLine();
		}
		bw.close();
	}
}
