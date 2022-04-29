package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet884 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1 = "fd kss fd", s2 = "fd fd kss";
		System.out.println(uncommonFromSentences(s1, s2));
	}
	
	public static String[] uncommonFromSentences(String s1, String s2) {
		
		Map<String, Integer> map = new HashMap<>();
		
		String AB = s1 + " " + s2;
		for(String s : AB.split(" ")) {
			if(s!=null || s.length()>0) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}
		}
		
		List<String> str = new ArrayList<>();
		for(String key : map.keySet()) {
			if(map.get(key) == 1) {
				str.add(key);
			}
		}
		return str.toArray(new String[str.size()]);
    }
}
