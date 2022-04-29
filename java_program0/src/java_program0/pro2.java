package java_program0;
import java.util.*;
public class pro2 {
	public static void main(String arge[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		switch(n) {
		case 1:System.out.println("I love Luogu!");break;
		case 2:System.out.println(6+" "+4); break;
		case 3:System.out.println(3);System.out.println(12);System.out.println(4); break;
		case 4:{		
			java.text.DecimalFormat df =new java.text.DecimalFormat("#.000");  
			String s = df.format((double)500/3);
			double v = Double.parseDouble(s);
			System.out.println(v);}
			break;
		case 5:System.out.println((260+220)/(12+20));break;
		case 6:System.out.println((float)Math.sqrt(6*6+9*9));break;
		case 7: System.out.println(100+10);
				System.out.println(110-20);
				System.out.println(0);
				break;

		case 8: System.out.println(5*2*3.141593); 
			    System.out.println(5*5*3.141593);
			    System.out.println(5*5*5*3.141593*4/3);
			    break;
		case 9:System.out.println(22);break;
		case 10:System.out.println(9);break;
		case 11:System.out.println((float)100/3.0);break;
		case 12:System.out.println((int)('M'-'A'));
				System.out.println((char)('A'+17));
				break;
		case 13:double pi = 3.141593;
		//这里的4 / 3需要写成4.0 / 3，因为4/3等于1，4.0 / 3等于1.3333
		//这样得到的最终结果不同
				double sum = 4.0 / 3 * (4 * 4 * 4 + 10 * 10 * 10) * pi;
				System.out.println((int)Math.pow(sum, 1.0/3));
				break;
		case 14:
			int a[]=new int[2];
			int j = 0;
			for (int i = 0; i < 100; i++)
			{
				if ((110 - i) * (10 + i) == 3500)
				{
					a[j++] = 110 - i;
				}
			}
			if (a[0] >= a[1])
				System.out.println(a[1]);
			else
				System.out.println(a[0]);
			break;
		default:break;
		}
		in.close();
	}
	
}
