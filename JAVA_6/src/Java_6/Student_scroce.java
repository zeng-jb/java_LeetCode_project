package Java_6;
import java.util.*;

class myException extends Exception{
	public myException() {
		// TODO �Զ����ɵĹ��캯�����
	}
	myException(String str){
		super(str);
	}
}
public class Student_scroce {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int []a=new int [10];
		System.out.println("����10��ѧ���ɼ���");
		try {
			int i;
			for(i=0;i<10;i++)a[i]=in.nextInt();
			
			if(i<10)throw new myException("����������10���ɼ�");
			 throw new Exception();
	
		}
		catch (myException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("������ɼ�");
		}
	
		finally {
			
		}
		Arrays.sort(a);
		for(int i=9;i>=0;i--)System.out.print(a[i]+" ");
	}
}
