package java_program0;
import java.util.*;
public class pro5 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
//		if((n%4==0&&n%100!=0)||n%400==0)System.out.println(1);
//		else System.out.println(0);
//		if(n==0||n==1)System.out.println("Today, I ate "+n+" apple.");
//		else System.out.println("Today, I ate "+n+" apples.");
		if(n*5<(11+n*3))System.out.println("Local");
		else System.out.println("Luogu");
	}
}
