package leet;

public class Leet344 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char [] s = {'h','e','l','l','o'};
		Leet344 obj = new Leet344();
		obj.reverseString(s);
		System.out.println(s.toString());
	}

	public void reverseString(char[] s) {
		int l = 0;
		int r = s.length-1;
		
		while(l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
    }
}
