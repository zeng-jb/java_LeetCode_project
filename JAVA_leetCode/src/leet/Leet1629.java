package leet;

import java.util.HashMap;
import java.util.Map;

public class Leet1629 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int [] releaseTimes = {9,29,49,50};
//		String  keysPressed = "cbcd";
		int []releaseTimes = {12,23,36,46,62};String keysPressed = "spuda";
		System.out.println(slowestKey(releaseTimes, keysPressed));
	}

	public static char slowestKey(int[] releaseTimes, String keysPressed) {
		Map<Character, Integer> map = new HashMap();
		map.put(keysPressed.charAt(0),releaseTimes[0]);
		for(int i=1;i<releaseTimes.length;i++) {
			char c = keysPressed.charAt(i);
			int num = releaseTimes[i]-releaseTimes[i-1];
			
			if(map.containsKey(c)) {
				map.put(c, (map.get(c)>num?map.get(c):num));
			}else {				
				map.put(c, num);
			}
		}
		int max=0;
		char ch = 'a';
		for(char c='z';c>='a';c--) {
			if(map.getOrDefault(c, 0)>max) {
				max = map.getOrDefault(c, 0);
				ch = c;
			}			
		}
		return ch;
    }
}
