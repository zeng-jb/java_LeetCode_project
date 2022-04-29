package java_program0;

import java.util.*;

public class pro4 {
	public static void main(String args[]) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int flag=1,flag1=1;
		flag=n%2;
		if(n>4&&n<=12)flag1=0;
		
		if(flag==0&&flag1==0)System.out.print(1+" ");
		else System.out.print(0+" ");
		if((flag&flag1)==0)System.out.print(1+" ");
		else System.out.print(0+" ");
		if((flag&flag1)==0&&flag-flag1!=0)System.out.print(1+" ");
		else System.out.print(0+" ");
		if((flag&flag1)==1)System.out.print(1+" ");
		else System.out.print(0+" ");
	}
}