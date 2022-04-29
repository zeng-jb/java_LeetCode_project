package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet954 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []arr = {2,1,2,6};
		Leet954 obj = new Leet954();
		System.out.println(obj.canReorderDoubled(arr));
	}
	public boolean canReorderDoubled(int[] arr) {
		Arrays.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			//如果i小于0，就需要找比他小两倍的，如果存在则成对减一，即i也不入map，否则将i入map
			if(i < 0) {
				if(map.containsKey(i * 2) && map.get(i * 2) != 0 ) {
					map.put(i * 2, map.get(i * 2) - 1);
				}else {
					map.put(i, map.getOrDefault(i, 0) + 1);
				}
			}else {
				//如果i大于0，且map存在i，则将i减一，否则就将i的两倍加入到map
				if(map.containsKey(i) && map.get(i) != 0) {
					map.put(i, map.get(i) - 1);
				}else {
					map.put(i * 2, map.getOrDefault(i * 2, 0) + 1);
				}
			}
		}
		//如果存在不为0 的情况表明没有成对出现昂。
		for( int v : map.values()) {
			if(v != 0) return false;
		}
		return true;
    }

}
