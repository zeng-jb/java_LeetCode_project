package leet;

public class Leet2047 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String sentence = "cat and 1 dog";
		System.out.println(countValidWords1(sentence));
	}
	
	public static int countValidWords(String sentence) {
		int ans=0;
		//ģ��
		String[] str = sentence.split(" ");
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			if(s==null || s.length()==0) continue;
			if(checkValid(s)) {
				ans++;
			}
			
		}
		
		return ans;
    }
	
	public static boolean checkValid(String s) {
		boolean hasHyphen = false;
		for(int j=0;j<s.length();j++) {
			char c = s.charAt(j);
			if(Character.isDigit(c)) {
				return false;
			}else if(c == '-') {
				if(hasHyphen || j==0 || j==s.length()-1 )	return false;
				if(!Character.isLetter(s.charAt(j-1)) || !Character.isLetter(s.charAt(j+1))) return false;
				hasHyphen = true;
			}else if(c == '!' || c == ',' || c == '.') {
				if(j!=s.length()-1)	return false;
			}
		}
		return true;
	}
	
	public static int countValidWords1(String sentence) {
		int ans=0;
		//��������ʽƥ��
		String regex = "([a-z]*|([a-z]+-[a-z]+))[!,.]?";
		String[] str = sentence.split(" ");
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			if(s==null || s.length()==0) continue;
			if(s.matches(regex)) {
				ans++;
			}
			
		}
		
		return ans;
    }
}
