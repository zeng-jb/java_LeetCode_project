package java_5;
import java.util.*;
interface Area<T extends Number>{
	public void area(T a);
}

class Square<T extends Number> implements Area<T>{ 
	public void area(T a) {
		int b=a.intValue();
		System.out.println("�����ε������"+b*b);
	}
}

class Round<T extends Number> implements Area<T>{
	public void area(T a) {
		double b=a.doubleValue();
		System.out.println("Բ�ε������"+3.14*b*b);
	}
}

public class java_5_2 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		
		Square<Integer> a=new Square<Integer>();
		System.out.println("�����������εı߳���");
		int b=in.nextInt();
		a.area(b);
		
		Round<Double> r=new Round<Double>();
		System.out.println("������Բ�ΰ뾶��");
		double c=in.nextDouble();
		r.area(c);
		
		in.close();
	}
}
