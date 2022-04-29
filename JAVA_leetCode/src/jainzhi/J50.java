package jainzhi;

public class J50 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "abaccdeff";
		J50 obJ50 = new J50();
		System.out.println(obJ50.firstUniqChar(s));
	}

	 public char firstUniqChar1(String s) {
		 int []target = new int[26];
		 
		 for(char c : s.toCharArray()) {
			 target[c-'a']++;
		 }
		 for(char c : s.toCharArray()) {
			 if(target[c-'a'] == 1) {
				 return c;
			 }
		 }
		 
		 return ' ';
	 }
	 
	 public char firstUniqChar(String s) {
		 for(int i=0;i<s.length();i++) {
			 char ch = s.charAt(i);
			 
			 if(s.indexOf(ch) == i && s.indexOf(ch, i+1) == -1) {
				 return ch;
			 }
		 }
		 return ' ';
	 }
}
