package leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Leet819 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		Leet819 obj = new Leet819();
		
		System.out.println(obj.mostCommonWord(paragraph, banned));
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		paragraph=paragraph.replace('!',' ').replace('?',' ').replace('\'',' ').replace(',',' ').replace(';',' ').replace('.',' ').trim();
		String []s = paragraph.split(" ");
//		String[] splits = paragraph.split("[ ,.!?:;']");
		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		
		for(String ban : banned) {
			set.add(ban);
		}
		
		for(String s1 : s) {
			if(!set.contains(s1) && !s1.equals("")) {				
				map.put(s1, map.getOrDefault(s1, 0) + 1);
			}
		}
		
		int max = -1;
		String ans = null;
		for(String str : map.keySet()) {
			if(map.get(str) > max) {
				ans = str;
				max = map.get(str);
			}
		}
		return ans;
    }
}
