package java_7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Arrays;


public class java_7_4_1 {
	public static void main(String args[]) throws IOException {
		LineNumberReader br=new LineNumberReader(new FileReader("data.txt"));
		String s;
		int []a=new int[5];
		int i=0;
		while ((s=br.readLine())!=null) {
			a[i++]=Integer.parseInt(s);
		}
		Arrays.sort(a);
		int sum=0;
		for(i=0;i<5;i++) {
			sum+=a[i];
		}
		System.out.println("ƽ���ɼ�Ϊ��"+sum/5);
		System.out.println("���ѧ���ĳɼ���С��������");
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
}
