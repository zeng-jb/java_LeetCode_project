package Java_Tu;

import java.io.Serializable;
import java.text.Format;

public class Triangle extends Shape implements Serializable{
	public int a,b,c;
	
	public Triangle() {
		// TODO �Զ����ɵĹ��캯�����
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
		System.out.println("�ܳ�Ϊ��"+Cir);
		System.out.println("���Ϊ��"+Are);
	}

	public String toString() {
		return "��������Ϣ��\n"+"�߳�Ϊ��"+a+" "+b+" "+c+"\n�ܳ�Ϊ��"+Circumference()+"\n���Ϊ��"+Area()+"\n";
	}
}
