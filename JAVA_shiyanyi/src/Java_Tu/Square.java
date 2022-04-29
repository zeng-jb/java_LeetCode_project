package Java_Tu;

import java.io.Serializable;

public class Square extends Shape implements Serializable {
	public double a,Cir,Are;
	
	public Square() {
		
		a=0;
	}
	public Square(double a) {
		this.a=a;
	}
	public double Circumference() {
		
		Cir=a*4;
		
		return Cir;
	}
	public double Area() {
		
		Are=a*a;
		
		return Are;
	}
	
	public void Show() {
		Circumference();
		Area();
		System.out.println("周长为："+Cir);
		System.out.println("面积为："+Are);
	}
	
	public String toString() {
		return "正方形信息：\n"+"边长为："+a+"\n周长为："+Circumference()+"\n面积为："+Area()+"\n";
	}
}
