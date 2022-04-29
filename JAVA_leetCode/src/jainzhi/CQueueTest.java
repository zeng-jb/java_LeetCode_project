package jainzhi;

import java.util.Stack;

public class CQueueTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CQueue obj = new CQueue();
		obj.appendTail(1);
		obj.appendTail(2);
		System.out.println(obj.deleteHead());
		System.out.println(obj.deleteHead());
		System.out.println(obj.deleteHead());
	}

}

class CQueue {

	Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
	
    public CQueue() {
    	
    }
    
    public void appendTail(int value) {
    	
    	while(!s1.isEmpty()) {
    		s2.add(s1.pop());
    	}
    	s1.add(value);
    	while(!s2.isEmpty()) {
    		s1.add(s2.pop());
    	}
    }
    
    public int deleteHead() {
    	
    	return s1.isEmpty() ? -1:s1.pop();
    }
}