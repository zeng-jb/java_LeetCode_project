package leet;

public class Leet744 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char [] letters = {'c', 'f', 'j'};
		char target = 'c';
		Leet744 obj = new Leet744();
		System.out.println(obj.nextGreatestLetter(letters, target));
	}

	public char nextGreatestLetter1(char[] letters, char target) {
		
		for(char letter : letters) {
			if(Character.compare(letter, target) > 0) {
				return letter;
			}
		}
		return letters[0];
    }
	
	public char nextGreatestLetter(char[] letters, char target) {
		int n = letters.length;
		int l = 0;
		int r = n-1;
		while(l < r) {
			int mid = (l + r) >> 1;
			if(letters[mid] > target) r = mid;
			else l = mid + 1;
		}
		return letters[r] > target ? letters[r] : letters[0];
	}
}
