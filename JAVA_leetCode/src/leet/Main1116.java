/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Main1116 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
//		try {
//			System.out.println(Integer.valueOf("aaa"));			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("����");
//		}
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 1������á�.����Ϊ�ָ��Ļ�,����������д��,String.split("\\."),����������ȷ�ķָ���,������String.split(".");

2������á�|����Ϊ�ָ��Ļ�,����������д��,String.split("\\|"),����������ȷ�ķָ���,������String.split("|");

3������á�*����Ϊ�ָ��Ļ�,����������д��,String.split("\\*"),����������ȷ�ķָ���,������String.split("*");

4������á�+����Ϊ�ָ��Ļ�,����������д��,String.split("\\+"),����������ȷ�ķָ���,������String.split("+");

5������á�\\����Ϊ�ָ��Ļ�,����������д��,String.split("\\\\"),����������ȷ�ķָ���,������String.split("\\");
		 */
		
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			String []str =  string.split("\\.");
			boolean flag = true;
			for (int i = 0; i < str.length; i++) {
				try {
					int num = Integer.valueOf(str[i]);
					if(num < 0 || num >255) flag = false;
					
				} catch (Exception e) {
					// TODO: handle exception
					flag = false;
				}
			}
			if(flag) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}

}
