package mainc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1461 {

	/*
	FJ��ɳ����д������һЩ�ַ�����
	A1  =  ��A��
	A2  =  ��ABA��
	A3  =  ��ABACABA��
	A4  =  ��ABACABADABACABA��
	��  ��
	�����ҳ����еĹ��ɲ�д���е�����AN��
	*/
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
