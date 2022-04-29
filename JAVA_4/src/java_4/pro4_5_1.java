package java_4;

public class pro4_5_1 {
	public static void mb_operate(String x,String y) {
		x.concat(y);
		System.out.println(x+" "+y);
		//System.out.println(&x+" "+&y);
		y=x;
		System.out.println(x+" "+y);
	}
	public static void main(String args[]) {
		String a="A";
		String b="B";
		mb_operate(a,b);
		System.out.println(a+"."+b);
	}
}
