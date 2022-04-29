package leet;

public class Leet917 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}

	public static String reverseOnlyLetters(String s) {
		int n = s.length();
		int left = 0 , right = n-1;
		char [] letters = s.toCharArray();
		while(left < right) {
			if(!Character.isLetter( letters[left])) {
				left++;
			}
			
			if(!Character.isLetter( letters[right])) {
				right--;
			}
			if(Character.isLetter( letters[left]) && Character.isLetter( letters[right])) {				
				char c = letters[left];
				letters[left++] = letters[right];
				letters[right--] = c;
			}
		}
		
		return String.valueOf(letters);
    }
}
