package leet;


//import java.util.Scanner;
//
//public class Muniugushi {
//
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		while ((num = sc.nextInt())!=0) {
//			
//			int [] numlist = new int[56];
//			numlist[0] = 0;
//			numlist[1] = 1;
//			numlist[2] = 2;
//			numlist[3] = 3;
//		
//			for(int i=4;i<=num;i++) {
//				numlist[i] = numlist[i-1] + numlist[i-3];
//			}
//			System.out.println(numlist[num]);
//		}
//		
//		sc.close();
//	}
//
//}



import java.util.Scanner;

public class Muniugushi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str="";
		int a ;
		while (scanner.hasNext()) {
			a = scanner.nextInt();
			char c = (char)a;
			str+=c;
		}
			System.out.print(str);
	}
}
