package leet;

public class Leet953 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		Leet953 obj = new Leet953();
		System.out.println(obj.isAlienSorted(words, order));
	}

	int[] letters = new int[26];
	public boolean isAlienSorted(String[] words, String order) {
		for(int i=0;i<order.length();i++) {
			letters[order.charAt(i) - 'a'] = i;
		}
		for(int i=0;i<words.length-1;i++) {
			if(compare(words[i] , words[i+1]) > 0) {
				return false;
			}
		}
		return true;
    }

	private int compare(String string1, String string2) {
		// TODO 自动生成的方法存根
		int m = string1.length();
		int n = string2.length();
		int min = Math.min(m, n);
		
		for(int i=0;i<min;i++) {
			
			return letters[string1.charAt(i) - 'a'] - letters[string2.charAt(i) - 'a'] ; 
			
		}
		return m-n;
	}
}
