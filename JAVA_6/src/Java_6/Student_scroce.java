package Java_6;
import java.util.*;

class myException extends Exception{
	public myException() {
		// TODO 自动生成的构造函数存根
	}
	myException(String str){
		super(str);
	}
}
public class Student_scroce {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int []a=new int [10];
		System.out.println("输入10个学生成绩：");
		try {
			int i;
			for(i=0;i<10;i++)a[i]=in.nextInt();
			
			if(i<10)throw new myException("请输入至少10个成绩");
			 throw new Exception();
	
		}
		catch (myException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("请输入成绩");
		}
	
		finally {
			
		}
		Arrays.sort(a);
		for(int i=9;i>=0;i--)System.out.print(a[i]+" ");
	}
}
