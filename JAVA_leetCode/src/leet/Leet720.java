package leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leet720 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		System.out.println(longestWord(words));
	}

	//模拟
	public static String longestWord0(String[] words) {
		//对字符串升序排序，如果长度相同则按字典降序排序
		Arrays.sort(words, (a,b)->{
			if(a.length() != b.length()) {
				return a.length() - b.length();
			}else {
				return b.compareTo(a);
			}
		});
		
		Set<String> set = new HashSet<>();
		String longest = "";
		set.add(longest);
		
		for (String word : words) {
			if(set.contains(word.subSequence(0, word.length()-1))) {
				set.add(word);
				longest = word;
			}
		}
		return longest;
    }
	
	
	//字典树
	static int N = 30010;
	static int M = 26;
	static int[][] trie = new int[N][M];
	static boolean[] EndPoint = new boolean[N];
	static int k = 1;
	public static String longestWord(String[] words) {
		Arrays.fill(EndPoint, false);
		for(int i=0;i<N;i++) {
			Arrays.fill(trie[i], 0);
		}
		k = 1;
		
		String ans = "";
		for(String word : words) {
			insert(word);
		}
		for(String word : words) {
			if(ans.length() > word.length()) continue;
			if(ans.length() == word.length() && word.compareTo(ans) > 0) continue;
			if(search(word)) ans = word;
		}
		
		return ans;
	}

	private static boolean search(String word) {
		// TODO 自动生成的方法存根  字典树的查找
		int len = word.length();
		int p = 0;
		for(int i=0;i<len;i++) {
			int c = word.charAt(i) - 'a';
			p = trie[p][c];
			if(!EndPoint[p]) {
				return false;
			}
		}
		return true;
	}
	
	private static void insert(String word) {
		// TODO 自动生成的方法存根 字典树插入方法
		int len = word.length();
		int p = 0;
		for(int i=0;i<len;i++) {
			int c = word.charAt(i) - 'a';
			if(trie[p][c] == 0) {
				trie[p][c] = k++;
			}
			p = trie[p][c];
		}
		EndPoint[p] = true;
	}
}
