package leet;

public class Leet537 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String num1 = "1+-1i", num2 = "1+-1i";
		System.out.println(complexNumberMultiply(num1, num2));
	}

	public static String complexNumberMultiply(String num1, String num2) {
		//(a+bi)*(c+di) = ac-bd + (ad+bc)i
		String[] a = num1.split("\\+|i");
		String[] b = num2.split("\\+|i");
		int a1 = Integer.parseInt(a[0]) , a2 = Integer.parseInt(a[1]);
		int b1 = Integer.parseInt(b[0]) , b2 = Integer.parseInt(b[1]);
		
		return a1*b1 - a2*b2 + "+" + (a1*b2 + a2*b1) + "i";
    }
}
