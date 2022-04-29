package leet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Leet380 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RandomizedSet randomizedSet = new RandomizedSet();
		System.out.println(randomizedSet.insert(1)); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
		System.out.println(randomizedSet.remove(2)); // 返回 false ，表示集合中不存在 2 。
		System.out.println(randomizedSet.insert(2)); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
		System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
		System.out.println(randomizedSet.remove(1)); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
		System.out.println(randomizedSet.insert(2)); // 2 已在集合中，所以返回 false 。
		System.out.println(randomizedSet.getRandom()); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
	}

}

class RandomizedSet {

	Map<Integer, Integer> map;
    public RandomizedSet() {
    	map = new HashMap<>();
    }
    
    public boolean insert(int val) {
    	if(!map.containsKey(val)) {
    		map.put(val, val);
    		return true;
    	}
    	return false;
    }
    
    public boolean remove(int val) {
    	if(map.containsKey(val)) {
    		map.remove(val);
    		return true;
    	}
    	return false;
    }
    
    public int getRandom() {
    	int ran = (int) Math.floor(Math.random() * map.size() );

    	for (Integer set :  map.keySet()) {
    		if(ran == 0) {
    			return map.get(set);
    		}
    		ran--;
    	}
    	return 0;
    }
}