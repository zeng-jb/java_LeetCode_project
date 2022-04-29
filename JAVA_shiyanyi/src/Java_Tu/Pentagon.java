package Java_Tu;

import java.io.Serializable;

public class Pentagon extends Shape implements Serializable{
	public double a,Cir,Are;
	
	public Pentagon() {
		
		a=0;
	}
	public Pentagon(double a) {
		this.a=a;
	}
	public double Circumference() {
		
		Cir=a*5;
		
		return Cir;
	}
	public double Area() {
		
		Are=5*a*a*Math.tan(54)/4;
		
		return Are;
	}
	
	public void Show() {
		Circumference();
		Area();
		System.out.println("周长为："+Cir);
		System.out.println("面积为："+String.format("%.2f", Are));
	}
	
	public String toString() {
		return "正五边形信息：\n"+"边长为："+a+"\n周长为："+Circumference()+"\n面积为："+Area()+"\n";
	}
}
