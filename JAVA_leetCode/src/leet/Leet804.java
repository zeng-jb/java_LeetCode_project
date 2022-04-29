package leet;

import java.util.HashSet;

public class Leet804 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String [] words = {"gin", "zen", "gig", "msg"};
		Leet804 obj = new Leet804();
		System.out.println(obj.uniqueMorseRepresentations(words));
	}

	public int uniqueMorseRepresentations(String[] words) {
		String []map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
		                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashSet<String> set = new HashSet<>();
		for(String word : words) {
			StringBuilder sb = new StringBuilder();
			for(char ch : word.toCharArray()) {
				sb.append(map[ch-'a']);
			}
			set.add(sb.toString());
		}
		return set.size();
    }
	
}
