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
		System.out.println("�ܳ�Ϊ��"+Cir);
		System.out.println("���Ϊ��"+Are);
	}
	
	public String toString() {
		return "��������Ϣ��\n"+"�߳�Ϊ��"+a+"\n�ܳ�Ϊ��"+Circumference()+"\n���Ϊ��"+Area()+"\n";
	}
}
