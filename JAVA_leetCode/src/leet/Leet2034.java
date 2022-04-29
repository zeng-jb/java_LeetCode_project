package leet;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Leet2034 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StockPrice obj = new StockPrice();
		obj.update(1, 10);
		obj.update(2, 5);
		System.out.println(obj.current());
		System.out.println(obj.maximum());
		obj.update(1, 3);
		System.out.println(obj.maximum());
		obj.update(4, 2);
		System.out.println(obj.minimum());
	}

}


class StockPrice {

	Map<Integer, Integer> map;
	PriorityQueue<Integer> minprice ;
	PriorityQueue<Integer> maxprice ;
	Stack<Integer> s;
	
    public StockPrice() {
    	map = new HashMap<>();
    	minprice = new PriorityQueue<>((a,b)->a-b);
    	maxprice = new PriorityQueue<>((a,b)->b-a);
    	s = new Stack<>();
    }
    
    public void update(int timestamp, int price) {
    	if(!map.containsKey(timestamp)) {
    		map.put(timestamp, price);    		
    	}else {
    		int oldprice = map.get(timestamp);
    		map.replace(timestamp, price);
    		maxprice.remove(oldprice);
    		minprice.remove(oldprice);
    	}
    	
    	minprice.add(price);
    	maxprice.add(price);
    	s.add(price);
    }
    
    public int current() {
    	return s.peek();
    }
    
    public int maximum() {
    	return maxprice.peek();
    }
    
    public int minimum() {
    	return minprice.peek();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */