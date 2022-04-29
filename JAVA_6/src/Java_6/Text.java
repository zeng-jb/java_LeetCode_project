package Java_6;
import java.util.*;
class Triangle{
	 int x,y,z;
	public Triangle() {
		// TODO �Զ����ɵĹ��캯�����
	}
	Triangle(int a,int b,int c){
		x=a;y=b;z=c;
	}
	double getArea() {
		double area=0;
		try {
			if(x+y>z&&x+z>y&&y+z>x) {
				double p=(x+y+z)*1.0/2;
				area=Math.sqrt(p*(p-x)*(p-y)*(p-z));
			}
			else {
				throw new NoTriangleException("���ܹ���������");
			}
		}
		catch (NoTriangleException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		return area;
	}
	void showInfo() {
		
		try {
			if(x+y>z&&x+z>y&&y+z>x) {
				System.out.println("�������εı߳�Ϊ��"+x+" "+y+" "+z);
			}
			else {
				throw new NoTriangleException("���ܹ���������");
			}
		}
		catch (NoTriangleException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
}
class NoTriangleException extends Exception{
	public NoTriangleException(){}
	NoTriangleException(String s){
		super (s);
	}
}
public class Text {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		try {
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			Triangle t=new Triangle(a, b, c);
			System.out.println("�����ε���Ϣ��");
			t.showInfo();
			System.out.println("�����ε������"+t.getArea());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.toString();
		}
	}
}
