package leet;

import java.util.HashSet;
import java.util.Set;

public class Leet824 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String sentence = "I speak Goat Latin";
		Leet824 obj = new Leet824();
		System.out.println(obj.toGoatLatin(sentence));
	}

	public String toGoatLatin(String sentence) {
		String[] words = sentence.split(" ");
		String indexWord = "a";
		String res = "";
		Set<Character> yuan = new HashSet();
		yuan.add('a');
		yuan.add('e');
		yuan.add('i');
		yuan.add('o');
		yuan.add('u');
		for(String word : words) {
			char first = word.charAt(0);
			first = Character.toLowerCase(first);
			if(yuan.contains(first)) {
				word = word + "ma" + indexWord;
			}else {
				word = word.substring(1) + word.charAt(0) + "ma" + indexWord;
			}
			indexWord = indexWord + "a";
			res = res + word + " ";
		}
		StringBuffer sbBuffer=new StringBuffer();
		return res.trim();
    }
}
