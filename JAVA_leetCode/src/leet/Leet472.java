/**
 * 
 */
package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leet.TrieTree.TrieNode;

/**
 * @author 123
 *
 */
public class Leet472 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		TrieTree tree = new TrieTree();
//		tree.insert("abcabc");
//		tree.insert("abc");
//		System.out.println(tree.search("abca"));
		
		
//		String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
		String[] words = {"cat","dog","catdog"};
		List<String> ans;
		ans = findAllConcatenatedWordsInADict(words);
		
		for (String string : ans) {
			System.out.println(string);
		}
	}

	
	public static List<String> findAllConcatenatedWordsInADict(String[] words) {
		TrieTree tree = new TrieTree();
		List<String> ans = new ArrayList<String>();
		Arrays.sort(words,(a,b) -> a.length()-b.length());
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if(word.length()==0)
				continue;	
			if(tree.dfs(word,0)) {
				ans.add(word);
			}else {
				tree.insert(word);
			}
		}
		
		return ans;
    }
	

}

class TrieTree{
	public class TrieNode {
		public int path;
		public int end;
		public TrieNode[] map;

		public TrieNode() {
			path = 0;
			end = 0;
			map = new TrieNode[26];// 26个字母
		}
	}

	private TrieNode root;
	
	public TrieTree() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		if (word == null)
			return;
		TrieNode node = root;
		node.path++;
		char[] words = word.toCharArray();
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			index = words[i] - 'a';
			if (node.map[index] == null) {
				node.map[index] = new TrieNode();
			}
			node = node.map[index];
			node.path++;
		}
		node.end++;
	}

	
	public boolean search(String word) {
		if (word == null)
			return false;
		TrieNode node = root;
		char[] words = word.toCharArray();
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			index = words[i] - 'a';
			if (node.map[index] == null)
				return false;
			node = node.map[index];
		}
		return node.end > 0;
	}

	
	public void delete(String word) {
		if (search(word)) {
			char[] words = word.toCharArray();
			TrieNode node = root;
			node.path--;
			int index = 0;
			for (int i = 0; i < words.length; i++) {
				index = words[i] - 'a';
				if (--node.map[index].path == 0) {
					node.map[index] = null;
					return;
				}
				node = node.map[index];
			}//for
			node.end--;
		}//if
	}

	
	public int prefixNumber(String pre) {
		if (pre == null)
			return 0;
		TrieNode node = root;
		char[] pres = pre.toCharArray();
		int index = 0;
		for (int i = 0; i < pres.length; i++) {
			index = pres[i] - 'a';
			if (node.map[index] == null)
				return 0;
			node = node.map[index];
		}
		return node.path;
	}

	
	public  boolean dfs(String word,int start) {
		if(word.length()==start)
			return true;
		
		TrieNode node = root;
		char[] words = word.toCharArray();
		int index = 0;
		for (int i = start; i < words.length; i++) {
			index = words[i] - 'a';
			if (node.map[index] == null)
				return false;
			node = node.map[index];
			if(node.end>0) {
				if(dfs(word, i+1)) {
					return true;
				}
			}
			
		}
		
		return false;
	}
}