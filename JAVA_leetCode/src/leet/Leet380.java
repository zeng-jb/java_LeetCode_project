package leet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Leet380 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		RandomizedSet randomizedSet = new RandomizedSet();
		System.out.println(randomizedSet.insert(1)); // �򼯺��в��� 1 ������ true ��ʾ 1 ���ɹ��ز��롣
		System.out.println(randomizedSet.remove(2)); // ���� false ����ʾ�����в����� 2 ��
		System.out.println(randomizedSet.insert(2)); // �򼯺��в��� 2 ������ true ���������ڰ��� [1,2] ��
		System.out.println(randomizedSet.getRandom()); // getRandom Ӧ������� 1 �� 2 ��
		System.out.println(randomizedSet.remove(1)); // �Ӽ������Ƴ� 1 ������ true ���������ڰ��� [2] ��
		System.out.println(randomizedSet.insert(2)); // 2 ���ڼ����У����Է��� false ��
		System.out.println(randomizedSet.getRandom()); // ���� 2 �Ǽ�����Ψһ�����֣�getRandom ���Ƿ��� 2 ��
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