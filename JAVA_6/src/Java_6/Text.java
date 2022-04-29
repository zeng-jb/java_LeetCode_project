package Java_6;
import java.util.*;
class Triangle{
	 int x,y,z;
	public Triangle() {
		// TODO 自动生成的构造函数存根
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
				throw new NoTriangleException("不能构成三角形");
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
				System.out.println("该三角形的边长为："+x+" "+y+" "+z);
			}
			else {
				throw new NoTriangleException("不能构成三角形");
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
			System.out.println("三角形的信息：");
			t.showInfo();
			System.out.println("三角形的面积："+t.getArea());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.toString();
		}
	}
}
