package leet;

import java.util.LinkedList;
import java.util.List;

public class Leet933 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RecentCounter recentCounter = new RecentCounter();
		System.out.println(recentCounter.ping(1));
		System.out.println(recentCounter.ping(100));
		System.out.println(recentCounter.ping(3001));
		System.out.println(recentCounter.ping(3002));
		System.out.println(recentCounter.ping(3004));
	}

}

class RecentCounter {

	List<Integer> list;
    public RecentCounter() {
    	list = new LinkedList<>();
    }
    
    public int ping(int t) {
    	list.add(t);
    	while(list.get(0) < t-3000) {
    		list.remove(0);
    	}
    	return list.size();
    }
}
