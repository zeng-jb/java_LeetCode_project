package Java_Tu;
import Java_Tu.Pentagon;
import Java_Tu.Round;
import Java_Tu.Square;
import Java_Tu.Triangle;
public class Test {
	public static void main(String args[]) {
//		Shape []shapes=new Shape[4];
//		shapes[0]=new Triangle(3,4,5);
		System.out.println("�������ܳ��������");
		Shape T =new Triangle(3,4,5);
		T.Show();
		
		//System.out.println("�ܳ�Ϊ��"+T.Circumference()); 
		
		System.out.println("�������ܳ��������");
		Shape S = new Square(5);
		S.Show();
		
		System.out.println("԰���ܳ��������");
		Shape R = new Round(3);
		R.Show();
		
		System.out.println("��������ܳ��������");
		Shape P = new Pentagon(5);
		P.Show();
	}
}
