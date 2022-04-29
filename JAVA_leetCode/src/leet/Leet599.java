package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet599 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		System.out.println(findRestaurant(list1, list2));

	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<list2.length;i++) {
			map.put(list2[i], i);
		}
		List<String> list = new ArrayList<>();
		int res = Integer.MAX_VALUE;
		for(int i=0;i<list1.length;i++) {
			if(map.containsKey(list1[i])) {
				if(i+map.get(list1[i]) == res) {
					list.add(list1[i]);
				}else if(i+map.get(list1[i]) < res) {
					res = i+map.get(list1[i]);
					list.clear();
					list.add(list1[i]);
				}
			}
		}
		return (String[])list.toArray(new String[0]);
    }
}
