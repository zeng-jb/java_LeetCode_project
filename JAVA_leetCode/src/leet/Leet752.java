package leet;

import java.util.HashSet;
import java.util.Set;

public class Leet752 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] deadends = {"0201","0101","0102","1212","2002"};
		String target = "0202";
		Leet752 obj = new Leet752();
		System.out.println(obj.openLock(deadends, target));
	}

	
	
	public int openLock0(String[] deadends, String target) {
		int step = 0;
		Set<String> visited = new HashSet<>(); 
		for (String dead : deadends) {
			visited.add(dead);
		}
		Set<String> set = new HashSet<>();
		set.add("0000");
		while(!set.isEmpty()) {
	
			Set<String> temp = new HashSet<>();
			for(String cur : set) {
				if(visited.contains(cur)) {
					continue;
				}
				if(cur.equals(target)) {
					return step;
				}
				visited.add(cur);
				for(int i=0;i<4;i++) {
					String up = plusOne(cur,i);
					if(!visited.contains(up)) {
						temp.add(up);
					}
					String down = minusOne(cur,i);
					if(!visited.contains(down)) {
						temp.add(down);
					}
				}
			}
			set = temp;
			step++;
		}
		return -1;
    }

	//双向BFS
	public int openLock(String[] deadends, String target) {
		Set<String> visited = new HashSet<>(); 
		for (String dead : deadends) {
			visited.add(dead);
		}
		Set<String> set1 = new HashSet<>();
		set1.add("0000");
		Set<String> set2 = new HashSet<>();
		set2.add(target);
		int step = 0;
		while(!set1.isEmpty() && !set2.isEmpty()) {
			Set<String> temp = new HashSet<>();
			for(String cur : set1) {
				if(visited.contains(cur)) {
					continue;
				}
				if(set2.contains(cur)) {
					return step;
				}
				visited.add(cur);
				for(int i=0;i<4;i++) {
					String up = plusOne(cur,i);
					if(!visited.contains(up)) {
						temp.add(up);
					}
					String down = minusOne(cur,i);
					if(!visited.contains(down)) {
						temp.add(down);
					}
				}
			}
			step++;
			set1 = set2;
			set2 = temp;
		}
		
		return -1;
	}

	private String minusOne(String cur, int i) {
		// TODO 自动生成的方法存根
		char[] str = cur.toCharArray();
		if(str[i] == '0') {
			str[i] = '9';
		}else {
			str[i] -= 1;
		}
		return new String(str);
	}



	private String plusOne(String cur, int i) {
		// TODO 自动生成的方法存根
		char[] str = cur.toCharArray();
		if(str[i] == '9') {
			str[i] = '0';
		}else {
			str[i] += 1;
		}
		return new String(str);
	}
}
