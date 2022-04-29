package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leet846 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int [] hand = {1,2,3,6,2,3,4,7,8};
//		int groupSize = 3;
		int [] hand = {1,2,3,4,5};
		int groupSize = 4;
//		int [] hand = {2,4,6};
//		int groupSize = 3;
		System.out.println(isNStraightHand(hand,groupSize));
	}
	
	//贪心算法
	public static boolean isNStraightHand1(int[] hand, int groupSize) {
		int n = hand.length;
		if(n % groupSize != 0) {
			return false;
		}
		Arrays.sort(hand);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : hand) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for (int i : hand) {
			if(!map.containsKey(i)) {
				continue;
			}
			for(int j =0;j<groupSize;j++) {
				int x = i+j;
				if(!map.containsKey(x)) {
					return false;
				}
				map.put(x, map.get(x)-1);
				if(map.get(x)==0) {
					map.remove(x);
				}
			}
		}
		
		return true;
    }
	
	public static boolean isNStraightHand(int[] hand, int groupSize) {
		HashMap<Integer, Integer> map = new HashMap<>();
		//小跟堆,,,优先队列
		PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->a-b); 
		
		for (int i : hand) {
			map.put(i, map.getOrDefault(i, 0)+1);
			q.add(i);
		}
		while(!q.isEmpty()) {
			int t = q.poll();
			if(map.get(t) == 0) continue;
			for(int i = 0;i<groupSize;i++) {
				int x = t+i;
				if(map.getOrDefault(x, 0) == 0) {
					return false;
				}
				map.put(x, map.get(x)-1);
			}
		}
		
		return true;
    }

}
