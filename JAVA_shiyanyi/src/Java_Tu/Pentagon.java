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
		System.out.println("�ܳ�Ϊ��"+Cir);
		System.out.println("���Ϊ��"+String.format("%.2f", Are));
	}
	
	public String toString() {
		return "���������Ϣ��\n"+"�߳�Ϊ��"+a+"\n�ܳ�Ϊ��"+Circumference()+"\n���Ϊ��"+Area()+"\n";
	}
}
