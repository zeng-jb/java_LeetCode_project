package Test;
import java.util.Scanner;

import Java_Tu.*;
public class TestVector {
	public void menu() {									//ʵ����˵���
		System.out.println("ͼ��������˵����������Ӧ�Ĳ������");
		System.out.println("1.���");
		System.out.println("2.ɾ��");
		System.out.println("3.����");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.����");
		System.out.println("7.�˳�����");
	}
	public static void main(String agrs[]) {				//ʵ���main
		TestVector v = new TestVector();
		
		VectorTest<Shape> vec =new VectorTest<>();			//����shape���͵�vector
		int choice;
		while (true) {
			v.menu();
			Scanner in =new Scanner(System.in);
			choice=in.nextInt();
			switch(choice) {
			case 1:											//���
				System.out.println("��������ӵ�ͼ�Σ�1.������ 2.������ 3.Բ�� 4.�������");
				int a=in.nextInt();
				if(a==1) {Shape T =new Triangle(3,4,5);vec.Add("������"); vec.Add(T.toString());}
				else if(a==2) {Shape S = new Square(5);vec.Add("������"); vec.Add(S.toString());}
				else if(a==3) {Shape R = new Round(3);vec.Add("԰��"); vec.Add(R.toString());}
				else if(a==4) {Shape P = new Pentagon(5);vec.Add("�������"); vec.Add(P.toString());}
				else {System.out.println("��������");}
				
				break;
			case 2:
				vec.showAll();								//ɾ��
				System.out.println("������Ҫɾ����Ԫ�أ�");
				vec.Remove(in.next());
				break;
			case 3:											//����
				System.out.println("��������Ҫ�Ĳ��ҵ�ͼ�Σ�");
				if(vec.Serach(in.next())==false) System.out.println("û�д�ͼ��");
				break;
			case 4:											//���л�
				vec.SetOpject();
				break;
			case 5:											//�����л�
				vec.UnSetObject();
				break;
			case 6:
				vec.showAll();								//���
				break;
			case 7:
				return;
			default:
				System.out.println("�����������������룺");
				break;
			}
		}
	}
}
