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
		System.out.println("�ܳ�Ϊ��"+Cir);
		System.out.println("���Ϊ��"+Are);
	}
	
	public String toString() {
		return "԰����Ϣ��\n"+"�뾶Ϊ��"+r+"\n�ܳ�Ϊ��"+Circumference()+"\n���Ϊ��"+Area()+"\n";
	}
}
