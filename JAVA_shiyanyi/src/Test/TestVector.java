package Test;
import java.util.Scanner;

import Java_Tu.*;
public class TestVector {
	public void menu() {									//实验二菜单栏
		System.out.println("图像类操作菜单：请输入对应的操作序号");
		System.out.println("1.添加");
		System.out.println("2.删除");
		System.out.println("3.查找");
		System.out.println("4.保存");
		System.out.println("5.加载");
		System.out.println("6.遍历");
		System.out.println("7.退出程序");
	}
	public static void main(String agrs[]) {				//实验二main
		TestVector v = new TestVector();
		
		VectorTest<Shape> vec =new VectorTest<>();			//定义shape类型的vector
		int choice;
		while (true) {
			v.menu();
			Scanner in =new Scanner(System.in);
			choice=in.nextInt();
			switch(choice) {
			case 1:											//添加
				System.out.println("请输入添加的图形：1.三角形 2.正方形 3.圆形 4.正五边形");
				int a=in.nextInt();
				if(a==1) {Shape T =new Triangle(3,4,5);vec.Add("三角形"); vec.Add(T.toString());}
				else if(a==2) {Shape S = new Square(5);vec.Add("正方形"); vec.Add(S.toString());}
				else if(a==3) {Shape R = new Round(3);vec.Add("园形"); vec.Add(R.toString());}
				else if(a==4) {Shape P = new Pentagon(5);vec.Add("正五边形"); vec.Add(P.toString());}
				else {System.out.println("输入有误！");}
				
				break;
			case 2:
				vec.showAll();								//删除
				System.out.println("请输入要删除的元素：");
				vec.Remove(in.next());
				break;
			case 3:											//查找
				System.out.println("请输入需要的查找的图形：");
				if(vec.Serach(in.next())==false) System.out.println("没有此图形");
				break;
			case 4:											//序列化
				vec.SetOpject();
				break;
			case 5:											//反序列化
				vec.UnSetObject();
				break;
			case 6:
				vec.showAll();								//输出
				break;
			case 7:
				return;
			default:
				System.out.println("输入有误，请重新输入：");
				break;
			}
		}
	}
}
