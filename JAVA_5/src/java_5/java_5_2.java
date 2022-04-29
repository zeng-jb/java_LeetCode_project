package java_5;
import java.util.*;
interface Area<T extends Number>{
	public void area(T a);
}

class Square<T extends Number> implements Area<T>{ 
	public void area(T a) {
		int b=a.intValue();
		System.out.println("正方形的面积："+b*b);
	}
}

class Round<T extends Number> implements Area<T>{
	public void area(T a) {
		double b=a.doubleValue();
		System.out.println("圆形的面积："+3.14*b*b);
	}
}

public class java_5_2 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		
		Square<Integer> a=new Square<Integer>();
		System.out.println("请输入正方形的边长：");
		int b=in.nextInt();
		a.area(b);
		
		Round<Double> r=new Round<Double>();
		System.out.println("请输入圆形半径：");
		double c=in.nextDouble();
		r.area(c);
		
		in.close();
	}
}
