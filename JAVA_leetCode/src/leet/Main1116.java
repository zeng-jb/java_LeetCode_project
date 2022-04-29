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
		// TODO 自动生成的方法存根
		
//		try {
//			System.out.println(Integer.valueOf("aaa"));			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("错误");
//		}
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 1、如果用“.”作为分隔的话,必须是如下写法,String.split("\\."),这样才能正确的分隔开,不能用String.split(".");

2、如果用“|”作为分隔的话,必须是如下写法,String.split("\\|"),这样才能正确的分隔开,不能用String.split("|");

3、如果用“*”作为分隔的话,必须是如下写法,String.split("\\*"),这样才能正确的分隔开,不能用String.split("*");

4、如果用“+”作为分隔的话,必须是如下写法,String.split("\\+"),这样才能正确的分隔开,不能用String.split("+");

5、如果用“\\”作为分隔的话,必须是如下写法,String.split("\\\\"),这样才能正确的分隔开,不能用String.split("\\");
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
