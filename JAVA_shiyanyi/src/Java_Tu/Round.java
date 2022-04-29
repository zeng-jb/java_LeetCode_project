package Java_Tu;

import java.io.Serializable;

public class Round extends Shape implements Serializable{
	public double r,Cir,Are;

	public Round() {
		
		r=0;
	}
	public Round(double r) {
		this.r=r;
	}
	public double Circumference() {
		
		Cir=r*2*3.14;
		
		return Cir;
	}
	public double Area() {
		
		Are=r*r*3.14;
		
		return Are;
	}
	
	public void Show() {
		Circumference();
		Area();
		System.out.println("周长为："+Cir);
		System.out.println("面积为："+Are);
	}
	
	public String toString() {
		return "园形信息：\n"+"半径为："+r+"\n周长为："+Circumference()+"\n面积为："+Area()+"\n";
	}
}
