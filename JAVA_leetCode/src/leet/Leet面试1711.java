package leet;

public class Leet面试1711 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] words = {"I","am","a","student","from","a","university","in","a","city"};
		String word1 = "a", word2 = "student";
		Leet面试1711 obj = new Leet面试1711();
		System.out.println(obj.findClosest(words, word1, word2));
	}

	public int findClosest(String[] words, String word1, String word2) {
		int index1 = -1;
		int index2 = -1;
		int closest = Integer.MAX_VALUE;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word1)) {
				index1 = i;
			}
			if(words[i].equals(word2)) {
				index2 = i;
			}
			if(index1 != -1 && index2 != -1) {
				closest = Math.min(closest, Math.abs(index1 - index2));
			}
		}
		return closest;
    }
}
