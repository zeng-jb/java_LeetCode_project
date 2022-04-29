package java_5;
import java.util.*;

enum month{
	Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
}
public class java_5_4 {
	public static void main(String args[]) {
		month[]m= month.values();
		int []a= {31,29,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]+":"+a[i]);
		}
	}
}
