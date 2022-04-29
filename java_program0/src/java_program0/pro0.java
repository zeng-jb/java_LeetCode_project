package java_program0;
import java.util.*;


public class pro0 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		//int a=c.length();
		int Lenght=getCharLength(c);
		for(int i=Lenght;i>0;i--)
			System.out.print(c.charAt(i-1));
	}
	
	public static int getCharLength(String content) {
	int count = 0;
	for (int i = 0, len = content.length(); i < len; ++i) {
        if ('\u4E00' <= content.charAt(i) && '\u9FBB' >= content.charAt(i)) {
            count++;
        }
    }
	return content.length()+count;
}
}

