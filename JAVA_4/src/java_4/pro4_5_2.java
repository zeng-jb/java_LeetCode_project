package java_4;

public class pro4_5_2 {
	public static void mb_swap(String [] s) {
		if(s.length<2)return;
		String t=s[0];
		s[0]=s[1];
		s[1]=t;
	}
	public static void main(String args[]) {
		String [] s= {"1","2"};
		mb_swap(s);
		System.out.println(s[0]+s[1]);
	}
}
