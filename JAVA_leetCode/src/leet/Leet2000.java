package leet;

public class Leet2000 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		String word = "abcdefd";
//		char ch = 'd';
//		System.out.println(reversePrefix1(word, ch));
		int n = 1 ,start = 7;
		System.out.println(xorOperation(n, start));
	}
	public static String reversePrefix(String word, char ch) {
		char [] words = word.toCharArray();
		for (int i = 0; i < words.length; i++) {
			char c = words[i];
			if(c == ch) {
				StringBuilder sb = new StringBuilder(word.substring(0, i+1));
				sb = sb.reverse();
				return sb.toString()+""+word.substring(i+1);
			}
		}
		return word;
    }
	public static String reversePrefix1(String word, char ch) {
//		int index = word.indexOf(ch);
//		if(index<0) return word;
//		StringBuilder sb = new StringBuilder(word.subSequence(0, index+1));
//		return sb.reverse().append(word.substring(index+1)).toString();
		
        int index =  word.indexOf(ch);
        return index < 0 ? word :
        	new StringBuilder(word.subSequence(0, index+1)).reverse().append(word.substring(index+1)).toString();
    }
	
	//Leet1486数组异或操作
	public static int xorOperation(int n, int start) {
		int ans = 0;
		for(int i =0;i<n;i++) {
			ans ^= 2*i+start;
		}
		return ans;
    }
}
