package java_program0;
import java.util.*;
public class pro1 {
	public static void main(String argc[]) {
		Scanner in=new Scanner(System.in);
		float a=in.nextFloat();
		int n=in.nextInt();

		java.text.DecimalFormat df =new java.text.DecimalFormat("#.000");  
		String s = df.format(a/n);
		double v = Double.parseDouble(s);

		System.out.println(v);
	}
}
