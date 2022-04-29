package Java_Tu;

import java.io.Serializable;
import java.text.Format;

public class Triangle extends Shape implements Serializable{
	public int a,b,c;
	
	public Triangle() {
		// TODO 自动生成的构造函数存根
		a=0;b=0;c=0;
	}
	public Triangle(int a,int b,int c) {
		super();
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double Are ,Cir;
	
	public double Circumference() {
		Cir=a+b+c;
		return Cir;
	}
	public double Area() {
		double p=(a+b+c)/2;
		
		Are=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return Are;
	}
	
	public void Show() {
		Circumference();
		Area();
		System.out.println("周长为："+Cir);
		System.out.println("面积为："+Are);
	}

	public String toString() {
		return "三角形信息：\n"+"边长为："+a+" "+b+" "+c+"\n周长为："+Circumference()+"\n面积为："+Area()+"\n";
	}
}
